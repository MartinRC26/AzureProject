package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un numero entre 0 y 1000: ");
    int n = input.nextInt();
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    System.out.println("La sumas de los digitos es: " + sum);
  }
}
