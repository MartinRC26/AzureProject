package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese el monto a invertir: ");
    double MontoDeInversion = input.nextDouble();
    
    System.out.print("Ingrese la tasa de interes anual en porcentaje: ");
    double PorcentajeAnualDeInteres = input.nextDouble();
    
    System.out.print("Ingrese el numero de años: ");
    double NumeroDeAños = input.nextInt();
    
    double PorcentajeMensualDeInteres = PorcentajeAnualDeInteres / 1200.0;
    double ValorFuturo = MontoDeInversion * Math.pow(1 + PorcentajeMensualDeInteres, NumeroDeAños * 12);
    System.out.println("El valor acumulado seria de " + ValorFuturo);
  }
}
