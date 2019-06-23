package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese los grados en Celsios: ");
    double celsios = input.nextDouble();

    double fahrenheit = (9.0 / 5) * celsios + 32;

    System.out.println(celsios + " grados Celsios equivalen a " + fahrenheit + " grados Fahrenheit");
  }
}