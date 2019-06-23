package Capítulo_2;

import java.util.Scanner;


public class Ejercicio_14 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float Libras, Kilos, Pulgadas, Metros, IMC;
        System.out.println("Ingrese la masa en libras: ");
        Libras = entrada.nextFloat();
        System.out.println("Ingrese la altura en pulgadas: ");
        Pulgadas = entrada.nextFloat();
        Kilos = (float)(Libras*0.45359237);
        Metros = (float)(Pulgadas*0.0254);
        IMC = (Kilos)/(Metros*Metros);
        System.out.println("El indice de masa corporal es " + IMC);
    }
}
