/*
 Holi!
Este programa lee numeros enteros, los suma y muestra el resultado en pantalla
 */

package ejemplo1;

import java.util.*;

public class Ejemplo1 {

    public static void main(String[] args) {
        long a=0;
        int b=0,c=0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        a=s.nextLong();
        System.out.print("Ingrese otro numero entero: ");
        b=s.nextInt();
        
        c=(int)(a+b);
        
        System.out.println("La suma de "+a+" mas "+b+" es: "+c);
    }
    
}
