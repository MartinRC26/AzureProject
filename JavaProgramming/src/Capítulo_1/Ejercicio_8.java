
package Capítulo_1;


public class Ejercicio_8 {
    public static void main(String[] args) {
        double radio = 5.5;
        double perimetro, area, pi = 3.1416;
        
        perimetro = 2 * radio * pi;
        area = radio * radio * pi;
        System.out.println("El perimetro del circulo es: " + perimetro);
        System.out.println("El area del circulo es: " + area);
    }
}