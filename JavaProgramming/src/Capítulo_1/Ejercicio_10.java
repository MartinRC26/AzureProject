
package Capítulo_1;


public class Ejercicio_10 {
    public static void main(String[] args) {
        double kilometros = 14, minutos = 45, segundos = 30, millas, horas, VelocidadEnMillasPorHora;
        millas = 1.6 * kilometros;
        horas = (minutos/60) + (segundos / 3600);
        VelocidadEnMillasPorHora = millas/horas;
        System.out.println("La velocidad en millas por hora es: " + VelocidadEnMillasPorHora);
    }
}
