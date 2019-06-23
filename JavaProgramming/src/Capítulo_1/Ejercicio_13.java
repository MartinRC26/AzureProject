package Capítulo_1;

public class Ejercicio_13 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        System.out.println("Tenemos el siguiente sistema de ecuaciones: ");
        
        System.out.println(" ax + by = e");
        System.out.println(" cx + dy = f");
        
        System.out.println("Para hallar x, nos dan la siguiente ecuación:");
        System.out.println("    x = (ed - bf)/(ad-bc)");
        
        System.out.println("Para hallar y, nos dan también la fórmula: ");
        System.out.println("    y = (af - ec) / (ad - bc)");
        
        System.out.println("");
        
        System.out.println("Nos dan estos valores:");
        System.out.println("a = 3.4");
        System.out.println("b = 50.2");
        System.out.println("c = 2.1");
        System.out.println("d = 0.55");
        System.out.println("e = 44.5");
        System.out.println("f = 5.9");
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;
        System.out.println("");
        
        System.out.println("Nos piden hallar x e y usando las fórmulas.");
        
        x = ((e*d) - (b*f))/((a*d)-(b*c));
        
        y = ((a*f) - (e*c)) / ((a*d) - (b*c));
        
        System.out.println("");
        System.out.println("Entonces, los valores de respectivos son: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
