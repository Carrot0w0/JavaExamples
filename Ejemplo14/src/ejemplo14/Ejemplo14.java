/*
 * Calculo del agua.
a) Cuota fija mensual $60
b) Primeros 50l gratis
c) Entre 51-200l el litro cuesta $5
d) Apartir de 201l el litro cuesta $10
 */

package ejemplo14;

import java.util.*;

public class Ejemplo14 {

    public static void main(String[] args) {
        double litros, precio=0;
        Scanner lol = new Scanner(System.in);
        
        System.out.print("Recibo del agua\n\nIngrese los litros usados: ");
        litros=lol.nextDouble();
        
        if(litros>50 && litros<=200)
            precio=(litros*5)+60;
        if(litros>200)
            precio=(litros*10)+60;
        
        System.out.println("Uso "+litros+" Litros\nTotal a pagar: "+precio);
    }
    
}
