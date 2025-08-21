import java.util.Date;

/**
 * Representa a una persona con nombre, apellidos y fecha de nacimiento.
 */
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;

    /**
     * Crea una persona con sus datos básicos.
     */
    public Persona(String nombre, String apellidoPaterno,
                   String apellidoMaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerNombre() { return nombre; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }
    public String obtenerApellidoMaterno() { return apellidoMaterno; }
    public Date obtenerFechaNacimiento() { return fechaNacimiento; }

    /**
     * Devuelve el nombre completo de la persona.
     */
    public String obtenerNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
