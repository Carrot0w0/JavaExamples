/*
 * Leer 10 numeros y contar cuantos estan entre 50 y 80
 */

package ejemplo21;

import java.util.*;

public class Ejemplo21 {

    public static void main(String[] args) {
        double numero;
        int si=0, no=0, i=1;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Cuales numeros estan entre el 50 y el 80? Ingresa varios numeros y podras saberlo\n");
        
        while(i<=10){
            System.out.print("#"+i+" = ");
            numero=lol.nextDouble();
            
            if(numero>=50 && numero <=80)
                si++; 
            
            i++;
        }
        
        no=10-si;
        System.out.println("\n\nNumeros entre el 50 y 80: "+si+"\nNumeros que no estan entre ese rango: "+no);
        
        
    }
    
}
