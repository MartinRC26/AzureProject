package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el subtotal y la tasa de propinas : ");
    double subtotal = input.nextDouble();
    double TasaDePropina = input.nextDouble();

    double Propina = subtotal * TasaDePropina;
    double total = subtotal + Propina;

    System.out.printf("La Propina es " + Propina + " y el total es " + total);
  }
}
