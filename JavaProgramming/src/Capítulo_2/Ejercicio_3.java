package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el valor de pies que desee convertir a metros: ");
    double pies = input.nextDouble();

    double metros = pies * 0.305;

    System.out.println(pies + " pies equivalen a " + metros + " metros.");
  }
}
