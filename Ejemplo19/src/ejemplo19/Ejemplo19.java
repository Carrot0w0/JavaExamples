/*
 * Leer una frase e invertirla (Do-While)
 */

package ejemplo19;

import java.util.*;

public class Ejemplo19 {
    public static void main(String[] args) {
        String holi;
        int i;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        holi=lol.nextLine();
        
        i=holi.length()-1;
        
        do{
            System.out.print(holi.charAt(i));
            i--;
        }while(i>=0);
        
    }
    
}
