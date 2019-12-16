/*
 * Leer una frase e invertirla (While)
 */

package ejemplo18;

import java.util.*;

public class Ejemplo18 {
    public static void main(String[] args) {
        String holi;
        int i;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        holi=lol.nextLine();
        
        i=holi.length()-1;
        
        while(i>=0){
            System.out.print(holi.charAt(i));
            i--;
        }
    }
    
}
