package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float Temperatura, Velocidad, SensacionTermica; 
        double cuadrado;
        
        System.out.println("Digite la temperatura en Fahrenheit entre -58F y 41F: ");
        Temperatura = entrada.nextFloat();
        
        System.out.println("Digite la velocidad del viento mayor a 2 en millas por ahora: ");
        Velocidad = entrada.nextFloat();
        
        cuadrado = (double)Math.pow(Velocidad, 0.16);
        
        SensacionTermica = (float)(35.74 + 0.6215*Temperatura - 35.75*cuadrado + 0.4275*Temperatura* cuadrado);
        
        System.out.println("El indice de sensacion termica es: " + SensacionTermica);
    }
}
