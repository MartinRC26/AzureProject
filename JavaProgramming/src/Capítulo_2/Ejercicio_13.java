package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_13 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float sueldo, total; 
        System.out.println("Ingrese el sueldo mensual: ");
        sueldo = entrada.nextFloat();
        total = (float) (sueldo + (sueldo*(1+0.0417)*(1+0.0417)*(1+0.0417)*(1+0.0417)*(1+0.0417)*(1+0.0417)));
        System.out.println("Después del sexto mes, la cuenta tendra un valor de " + total + "soles. ");
    }
}
