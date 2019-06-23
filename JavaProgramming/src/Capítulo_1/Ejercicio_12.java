
package Capítulo_1;

public class Ejercicio_12 {
    public static void main(String[] args) {
        double RecorridoMillas = 24, Horas = 1, Minutos = 40, Segundos = 35;
        double Kilometros, TiempoTotalEnHoras, VelocidadEnKmHoras;
        
        Kilometros = 1.6 * RecorridoMillas;
        TiempoTotalEnHoras = Horas + (Minutos / 60.0) + (Segundos / 3600.0);
        
        VelocidadEnKmHoras = Kilometros / TiempoTotalEnHoras;
        
        System.out.println("La velocidad en kilometros por hora del corredor es de: " + VelocidadEnKmHoras);
    }
}
