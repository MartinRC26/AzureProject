package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float Distancia, Velocidad, Aceleracion;
        System.out.print("Ingrese velocidad y aceleracion del avion: ");
        Velocidad = entrada.nextFloat();
        Aceleracion = entrada.nextFloat();
        Distancia = (Velocidad*Velocidad)/(2*Aceleracion);
        System.out.println("La minima distancia recorrida por el avion es de " + Distancia + " metros.");
    }
}
