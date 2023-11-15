public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private int inventario;

    public Producto(int idProducto, String nombreProducto, double precio, int inventario) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.inventario = inventario;
    }

    // Getters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getInventario() {
        return inventario;
    }
}
