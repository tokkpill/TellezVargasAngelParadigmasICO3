public class PruebaAccesoMiembros {

    public static void main(String[] args) {

        Tiempo1 tiempo = new Tiempo1();  // Crea un objeto de Tiempo1

        // Usamos el método público para establecer la hora
        tiempo.establecerTiempo(16, 15, 30);

        // Mostrar la hora
        System.out.println("Tiempo universal: " + tiempo.aStringUniversal());
        System.out.println("Tiempo estándar: " + tiempo);
    }
}
