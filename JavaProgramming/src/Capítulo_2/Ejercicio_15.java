package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double Distancia, x1, x2, y1, y2, cuadrado;
        System.out.println("Ingrese las coordenadas del primer punto (x1 y y1): ");
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto (x2 y y2): ");
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();
        cuadrado = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Distancia = Math.pow(cuadrado, 0.5); //Equivale a decir Distancia = cuadrado^0.5
        System.out.println("La distancia entre los dos puntos es " + Distancia);
    }
}
