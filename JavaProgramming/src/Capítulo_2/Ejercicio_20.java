package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el saldo y la tasa de interes anual (Ejemplo: para 3% escribir solo '3'): ");
    double Saldo = input.nextDouble();
    double TasaDeInteres = input.nextDouble();

    double Interes = Saldo * (TasaDeInteres / 1200.0);

    System.out.println("El interes tendra un valor de " + Interes);
  }
}
