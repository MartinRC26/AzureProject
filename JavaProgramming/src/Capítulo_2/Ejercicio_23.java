import java.util.Scanner;

public class Ejercicio_23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Ingrese la distancia de manejo: ");
    double Distancia = input.nextDouble();
    
    System.out.print("Ingrese la eficiencia de millas por galon: ");
    double MillasPorGalon = input.nextDouble();
    
    System.out.print("Ingrese el precio por galon: ");
    double PrecioPorGalon = input.nextDouble();

    double GalonesNecesarios = Distancia / MillasPorGalon;
    
    double CostoDeViaje = GalonesNecesarios * PrecioPorGalon;

    System.out.printf("El costo de viaje seria de " + CostoDeViaje + " dolares.");
  }
}
