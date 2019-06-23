package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int poblacion = 312032486;
        int dias = 365;
        int segundos, nacimientos, muertes, inmigraciones, poblacionFinal, años;
        System.out.print("Ingrese el numero de años: ");
        años = entrada.nextInt();
        segundos = años * dias * 24* 3600;
        nacimientos = segundos / 7;
        muertes = segundos / 13;
        inmigraciones = segundos / 45;
        poblacionFinal = poblacion + nacimientos - muertes + inmigraciones;
        System.out.println("La población dentro de " + años + " años será de " + poblacionFinal + " habitantes."); 
    }
}
