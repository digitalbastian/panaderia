import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Usuario> usuarios = CSVReader.readCSV("./data/usuarios.csv");
        System.out.println("\t Bienvenido !");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ",\nCorreo: " + usuario.getCorreo() +
                               ",\nContraseña: " + usuario.getContraseña() + ",\nTipo de Usuario: " + usuario.getTipoUsuario()+"\n");
        }

        System.out.println("Listado de productos: ");
        List<Producto> productos = CSVReader.readCSVProductos("./data/productos.csv");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getIdProducto() + ", Nombre: " + producto.getNombreProducto() +
                                ", Precio: " + producto.getPrecio() + ", Inventario: " + producto.getInventario());
        }
    }
}
