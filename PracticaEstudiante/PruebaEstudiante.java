import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Programa para registrar estudiantes, calcular su promedio y cambiar su carrera.
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE ESTUDIANTES ===");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido Paterno: ");
        String apellidoPaterno = scanner.nextLine();
        System.out.print("Apellido Materno: ");
        String apellidoMaterno = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
        Date fechaNacimiento = parseFecha(scanner.nextLine());
        System.out.print("ID del estudiante: ");
        String id = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Año de graduación esperado: ");
        int anioGraduacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Estudiante estudiante = new Estudiante(nombre, apellidoPaterno, apellidoMaterno,
                                               fechaNacimiento, id, carrera, titulo, anioGraduacion);

        System.out.println("\n=== DATOS DEL ESTUDIANTE REGISTRADO ===");
        System.out.println(estudiante.toString());

        System.out.print("\nIngrese el número de calificaciones: ");
        int numCalificaciones = scanner.nextInt();
        scanner.nextLine();

        String[] calificaciones = new String[numCalificaciones];
        System.out.println("Ingrese las calificaciones (A, A-, B+, B, B-, C+, C, D, F):");
        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextLine();
        }

        double promedio = estudiante.calcularPromedio(calificaciones);
        System.out.printf("Promedio calculado: %.2f%n", promedio);

        System.out.print("¿Desea cambiar la carrera del estudiante? (si/no): ");
        if (scanner.nextLine().equalsIgnoreCase("si")) {
            System.out.print("Ingrese la nueva carrera: ");
            estudiante.cambiarCarrera(scanner.nextLine());
        }

        System.out.println("\n=== PROGRAMA FINALIZADO ===");
        scanner.close();
    }

    /**
     * Convierte una cadena dd/MM/yyyy a Date, usa fecha actual si es inválida.
     */
    private static Date parseFecha(String fechaStr) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(fechaStr);
        } catch (Exception e) {
            System.out.println("Formato de fecha inválido. Usando fecha actual.");
            return new Date();
        }
    }
}
