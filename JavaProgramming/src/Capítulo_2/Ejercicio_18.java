
package Capítulo_2;


public class Ejercicio_18 {
    public static void main(String[] args) {
        System.out.println("a   b   pow(a, b)");
        int i;
        for(i=1; i<=5; i++){
            int j = i+1;
        int Potencia = (int) Math.pow(i,j);
        System.out.println(i + "   " + (i+1) + "   " + Potencia);
    }
}
}