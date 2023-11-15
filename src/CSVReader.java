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

    public static List<Producto> readCSVProductos(String path) {
        List<Producto> productos = new ArrayList<>();
        File file = new File(path);
    
        if (file.exists()) {
            // Leer el archivo
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                // Omitir la línea de encabezado
                if (br.readLine() != null) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");
                        Producto producto = new Producto(
                            Integer.parseInt(values[0].trim()),
                            values[1],
                            Double.parseDouble(values[2].trim()),
                            Integer.parseInt(values[3].trim())
                        );
                        productos.add(producto);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Crea el archivo con un producto por defecto
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write("ID de producto,Nombre del producto,Precio,Inventario\n");
                bw.write("1,Producto Ejemplo,10.99,50\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Añadir el producto por defecto a la lista
            productos.add(new Producto(1, "Producto Ejemplo", 10.99, 50));
        }
    
        return productos;
    }
}
