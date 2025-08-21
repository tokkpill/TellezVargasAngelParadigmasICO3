public class Tiempo2 {
    private int hora;    // 0-23
    private int minuto;  // 0-59
    private int segundo; // 0-59

    // Constructores sobrecargados con valores por defecto
    public Tiempo2() {
        this(0, 0, 0);  // Constructor por defecto (00:00:00)
    }

    public Tiempo2(int hora) {
        this(hora, 0, 0);  // Solo hora, minutos y segundos a 0
    }

    public Tiempo2(int hora, int minuto) {
        this(hora, minuto, 0);  // Hora y minuto, segundos a 0
    }

    // Constructor principal con validación
    public Tiempo2(int hora, int minuto, int segundo) {
        // Validación de rangos
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Constructor de copia
    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    // --- Métodos Establecer (setters) con validación ---
    public void establecerTiempo(int hora, int minuto, int segundo) {
        establecerHora(hora);
        establecerMinuto(minuto);
        establecerSegundo(segundo);
    }

    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        this.hora = hora;
    }

    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
        this.minuto = minuto;
    }

    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
        this.segundo = segundo;
    }

    // --- Métodos Obtener (getters) ---
    public int obtenerHora() { return hora; }
    public int obtenerMinuto() { return minuto; }
    public int obtenerSegundo() { return segundo; }

    // --- Métodos de formato ---
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Formato estándar (12 horas con AM/PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((hora == 0 || hora == 12) ? 12 : hora % 12),
            minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}
