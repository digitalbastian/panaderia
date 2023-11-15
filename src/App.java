import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Usuario> usuarios = CSVReader.readCSV("./data/usuarios.csv");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Correo: " + usuario.getCorreo() +
                               ", Contraseña: " + usuario.getContraseña() + ", Tipo de Usuario: " + usuario.getTipoUsuario());
        }
    }
}
