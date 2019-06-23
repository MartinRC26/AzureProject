package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double Masa, Energia, temperaturaFinal, temperaturaInicial;
        System.out.print("Ingrese el total de agua en kilogramos: ");
        Masa = entrada.nextFloat();
        System.out.print("Ingrese la temperatura inicial (°C): ");
        temperaturaInicial = entrada.nextFloat();
        System.out.print("Ingrese la temperatura final (°C): ");
        temperaturaFinal = entrada.nextFloat();
        Energia = Masa * (temperaturaFinal - temperaturaInicial) * 4184;
        System.out.println("La energia necesitada es " + Energia + " Joules.");
    }
}
