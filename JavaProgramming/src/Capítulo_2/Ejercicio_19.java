package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float x1, x2, x3, y1, y2, y3;
        double Semiperimetro, Lado1, Lado2, Lado3, CalculoDelLado1, CalculoDelLado2, CalculoDelLado3, CalculoDelArea, Area;
        System.out.println("Ingrese las coordenadas de los 3 puntos del triangulo: ");
        System.out.println("Punto 1: ");
        x1 = entrada.nextFloat();
        y1 = entrada.nextFloat();
        
        System.out.println("Punto 2: ");
        x2 = entrada.nextFloat();
        y2 = entrada.nextFloat();
        
        System.out.println("Punto 3: ");
        x3 = entrada.nextFloat();
        y3 = entrada.nextFloat();
        
        CalculoDelLado1 = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        CalculoDelLado2 = (x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
        CalculoDelLado3 = (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
        Lado1 = Math.pow(CalculoDelLado1, 0.5);
        Lado2 = Math.pow(CalculoDelLado2, 0.5);
        Lado3 = Math.pow(CalculoDelLado3, 0.5);
        Semiperimetro = (Lado1+Lado2+Lado3)/2;
        CalculoDelArea = Semiperimetro * (Semiperimetro-Lado1) * (Semiperimetro-Lado2) * (Semiperimetro-Lado3);
        Area = Math.pow(CalculoDelArea, 0.5);
        System.out.println("El area del triangulo es " + Area);
    }
}
