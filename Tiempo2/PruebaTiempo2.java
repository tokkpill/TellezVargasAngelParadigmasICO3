public class PruebaTiempo2 {
    public static void main(String[] args) {
        // Creación de objetos con diferentes constructores
        Tiempo2 t1 = new Tiempo2();          // 00:00:00
        Tiempo2 t2 = new Tiempo2(2);         // 02:00:00
        Tiempo2 t3 = new Tiempo2(21, 34);    // 21:34:00
        Tiempo2 t4 = new Tiempo2(12, 25, 42);// 12:25:42
        Tiempo2 t5 = new Tiempo2(t4);        // Copia de t4

        // Mostrar los tiempos creados
        System.out.println("Se construyó con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: solo hora especificada", t2);
        mostrarTiempo("t3: hora y minuto especificados", t3);
        mostrarTiempo("t4: hora, minuto y segundo especificados", t4);
        mostrarTiempo("t5: copia de t4", t5);

        // Prueba de manejo de excepciones con valores inválidos
        try {
            new Tiempo2(27, 74, 99); // Valores inválidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }
    }

    // Método auxiliar para mostrar el tiempo en ambos formatos
    private static void mostrarTiempo(String encabezado, Tiempo2 t) {
        System.out.printf("%s%n %s%n %s%n", 
            encabezado, t.aStringUniversal(), t.toString());
    }
}
