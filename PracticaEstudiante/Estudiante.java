import java.util.Date;

/**
 * Representa a un estudiante, heredando de Persona, con información académica.
 */
public class Estudiante extends Persona {
    private String id;
    private double promedioCalificaciones;
    private String carrera;
    private String titulo;
    private int anioGraduacion;

    /**
     * Crea un estudiante con todos sus datos.
     */
    public Estudiante(String nombre, String apellidoPaterno,
                      String apellidoMaterno, Date fechaNacimiento,
                      String id, String carrera, String titulo, int anioGraduacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.id = id;
        this.promedioCalificaciones = 0.0;
        this.carrera = carrera;
        this.titulo = titulo;
        this.anioGraduacion = anioGraduacion;
    }

    public String obtenerId() { return id; }
    public double obtenerPromedio() { return promedioCalificaciones; }
    public String obtenerCarrera() { return carrera; }
    public String obtenerTitulo() { return titulo; }
    public int obtenerAnioGraduacion() { return anioGraduacion; }

    /**
     * Cambia la carrera del estudiante.
     */
    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
        System.out.println("Carrera cambiada exitosamente a: " + nuevaCarrera);
    }

    /**
     * Calcula el promedio a partir de un arreglo de calificaciones literales.
     */
    public double calcularPromedio(String[] calificaciones) {
        double suma = 0.0;
        for (String calificacion : calificaciones) {
            suma += convertirCalificacionAPuntos(calificacion);
        }
        this.promedioCalificaciones = suma / calificaciones.length;
        return this.promedioCalificaciones;
    }

    private double convertirCalificacionAPuntos(String calificacion) {
        switch (calificacion.toUpperCase()) {
            case "A": return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Estudiante:\nNombre: %s %s %s\nFecha de Nacimiento: %s\nID: %s\nPromedio: %.2f\nCarrera: %s\nTítulo: %s\nAño de Graduación: %d",
            obtenerNombre(), obtenerApellidoPaterno(), obtenerApellidoMaterno(),
            obtenerFechaNacimiento(), id, promedioCalificaciones, carrera, titulo, anioGraduacion
        );
    }
}
