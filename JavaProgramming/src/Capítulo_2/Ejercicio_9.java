package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float aceleracion, VelInicial, VelFinal, tiempo;
        System.out.print("Ingrese la velocidad inicial, velocidad final y el tiempo (en segundos): ");
        VelInicial = entrada.nextFloat();
        VelFinal = entrada.nextFloat();
        tiempo = entrada.nextFloat();
        aceleracion = (VelFinal-VelInicial)/tiempo;
        System.out.println("La aceleracion media es " + aceleracion + ".");
    }
}
