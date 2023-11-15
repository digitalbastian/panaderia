import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Usuario> usuarios = CSVReader.readCSV("./data/usuarios.csv");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Correo: " + usuario.getCorreo() +
                               ", Contraseña: " + usuario.getContraseña() + ", Tipo de Usuario: " + usuario.getTipoUsuario());
        }

        List<Producto> productos = CSVReader.readCSVProductos("./data/productos.csv");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getIdProducto() + ", Nombre: " + producto.getNombreProducto() +
                                ", Precio: " + producto.getPrecio() + ", Inventario: " + producto.getInventario());
        }
    }
}
