public class PruebaThis {

    public static void main(String[] args) {
        // Crea un TiempoSimple con hora, minuto y segundo dados
        TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
        
        // Muestra cómo se usa 'this' en la clase
        System.out.println(tiempo.crearString());
    }
}

// La clase TiempoSimple demuestra la referencia "this".
class TiempoSimple {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor que inicializa los atributos usando 'this' para diferenciar parámetros
    public TiempoSimple(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Crea un string que compara uso explícito e implícito de 'this'
    public String crearString() {
        return String.format("%24s: %s%n%24s: %s",
                "this.aStringUniversal()", this.aStringUniversal(), // explícito
                "aStringUniversal()", aStringUniversal());          // implícito
    }

    // Devuelve la hora en formato universal
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
