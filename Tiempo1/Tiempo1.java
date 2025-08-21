public class Tiempo1 {

    // Variables privadas que almacenan la hora, minuto y segundo
    private int hora;
    private int minuto;
    private int segundo;

    // Método público para establecer la hora
    public void establecerTiempo(int hora, int minuto, int segundo) {
        // Validación de rangos
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60) {
            // Si algún valor está fuera de rango, lanza una excepción
            throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de rango");
        }

        // Si los valores son válidos, los asigna a los atributos de la clase
        this.hora = hora;       // "this.hora" es el atributo de la clase
        this.minuto = minuto;   // "this" se usa para diferenciar de las variables del parámetro
        this.segundo = segundo;
    }

    // Método para mostrar la hora en formato universal (24 horas)
    public String aStringUniversal() {
        // Devuelve la hora formateada con dos dígitos por campo
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método para mostrar la hora en formato estándar (12 horas con AM/PM)
    public String toString() {
        // Ajusta la hora al formato de 12 horas y añade AM o PM
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}
