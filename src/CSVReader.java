import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Usuario> readCSV(String path) {
        List<Usuario> usuarios = new ArrayList<>();
        File file = new File(path);

        // Verificar si el archivo existe
        if (file.exists()) {
            // Leer el archivo
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                // Omitir la línea de encabezado
                if (br.readLine() != null) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");
                        Usuario usuario = new Usuario(values[0], values[1], values[2], Integer.parseInt(values[3].trim()));
                        usuarios.add(usuario);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Crear el archivo con un usuario por defecto
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write("Nombre,Correo,Contraseña,Tipo de Usuario\n");
                bw.write("admin,admin@example.com,admin,1\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Añadir el usuario por defecto a la lista
            usuarios.add(new Usuario("admin", "admin@example.com", "admin", 1));
        }

        return usuarios;
    }
}
