public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private int tipoUsuario;

    public Usuario(String nombre, String correo, String contraseña, int tipoUsuario) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }
}
