package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el numero de libras que desea convertir a kilogramos: ");
    double libras = input.nextDouble();

    double kilogramos = libras * 0.454;

    System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos");
  }
}
