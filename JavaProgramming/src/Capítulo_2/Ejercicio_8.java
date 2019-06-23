package Capítulo_2;

import java.util.Scanner;

public class Ejercicio_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el valor de la zona horaria geográfica (considere *-5* para la hora peruana): ");
    int HoraPorZona = input.nextInt();

    long TiempoEnMiliSegundos = System.currentTimeMillis();
    long TotalSegundos = TiempoEnMiliSegundos / 1000;
    long SegundoActual = TotalSegundos % 60;
    long TotalMinutos = TotalSegundos / 60;
    long MinutoActual = TotalMinutos % 60;
    long TotalHoras = TotalMinutos / 60;
    long HoraActual = (TotalHoras + HoraPorZona) % 24;

    System.out.println("El tiempo actual es: " + HoraActual + ":" + MinutoActual +
      ":" + SegundoActual);
  }
}
