
package Capítulo_1;

public class Ejercicio_11 {
    public static void main(String[] args) {
       int i, poblacion = 312032486, año = 365;
       int SegundosEnAños, Nacimientos = 0, Muertes = 0, Inmigrantes = 0, PoblacionNueva;
        SegundosEnAños = 365 * 3600 * 24               ;
        for( i = 1; i <=SegundosEnAños; i++){
            if( i%7 == 0){
                Nacimientos = i / 7;
            }
            if(i%13 == 0){
                Muertes = i / 13;
            }
            if(i%45 == 0){
                Inmigrantes = i /45;
            }
        }
        PoblacionNueva = poblacion + Nacimientos - Muertes + Inmigrantes;
        System.out.println("La poblacion nueva dentro de 5 años seria de: " + PoblacionNueva);
    }    
}
