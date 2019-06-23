package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int minutos;
        int dias, años;
        System.out.println("Digite el numero de minutos: ");
        minutos = entrada.nextInt();
        
        años = minutos/(60*24*365);
        dias = ((minutos&(24*365))/60);
        System.out.println(minutos + " minutos es, aproximadamente, " + años + " años y " + dias + " dias");
    }
}
