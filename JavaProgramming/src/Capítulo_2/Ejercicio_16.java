package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double Lado, Raiz, Area;
        System.out.println("Ingrese el lado: ");
        Lado = entrada.nextDouble();
        Raiz = Math.sqrt(3); 
        Area = (3*Raiz*Lado*Lado)/2;
        System.out.println("El area del hexagono es " + Area);
    }
}
