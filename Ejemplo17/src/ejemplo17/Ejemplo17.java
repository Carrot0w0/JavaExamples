/*
 * Leer una frase e invertirla (For)
 */

package ejemplo17;

import java.util.*;

public class Ejemplo17 {

    public static void main(String[] args) {
        String holi;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        holi=lol.nextLine();
        
        for(int i=holi.length()-1;i>=0;i--){
            System.out.print(holi.charAt(i));
        }
    }
    
}
