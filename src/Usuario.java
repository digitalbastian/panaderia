public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private String tipoUsuario;

    public Usuario(String nombre, String correo, String contraseña, String tipoUsuario) {
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

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
