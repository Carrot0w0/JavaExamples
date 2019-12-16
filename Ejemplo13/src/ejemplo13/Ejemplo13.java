/*
 * Elevar al cuadrado si es par, si es impar elevar al cubo
 */

package ejemplo13;

import java.util.*;
import java.math.*;

public class Ejemplo13 {

    public static void main(String[] args) {
        double aumento, numero=0;
        Scanner lol = new Scanner(System.in);
        
        System.out.print("Valoracion de par e impar\n\nIngrese el numero: ");
        numero=lol.nextDouble();
        
        if(numero%2==0){
            aumento=Math.pow(numero,2);
            System.out.println("El numero "+numero+" es par\nResultado: "+aumento);
        }
        else{
            aumento=Math.pow(numero,3);
            System.out.println("El numero "+numero+" es impar\nResultado: "+aumento);
        }
        }
    }
    

