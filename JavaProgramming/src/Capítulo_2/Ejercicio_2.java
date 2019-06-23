package Capítulo_2;        
        
import java.util.Scanner;

public class Ejercicio_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite el radio y la longitud del cilindro: ");
    double radio = input.nextDouble();
    double longitud = input.nextDouble();

    double area = radio * radio * 3.14;
    double volumen = area * longitud;

    System.out.println("El area es " + area);
    System.out.println("El volumen es " + volumen);
  }
}