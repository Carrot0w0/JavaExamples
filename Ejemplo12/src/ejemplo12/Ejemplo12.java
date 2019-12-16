/*
 * Sueldo de un trabajador
-Categoria 3, se aunmenta 15%, sino aunmenta 10%
 */

package ejemplo12;

import java.util.*;

public class Ejemplo12 {

    public static void main(String[] args) {
        double actual,end;
        String line;
        int categoria=0;
        Scanner lol = new Scanner(System.in);
        
        System.out.print("Aumento de sueldo...\n\nIngrese lo que se te pide:\n\t-Sueldo: $");
        line=lol.nextLine();
        actual=Double.parseDouble(line);
        System.out.print("\t-Categoria: ");
        categoria=lol.nextInt();
        
        if(categoria==3)
            end=(actual*0.15)+actual;
        else
            end=(actual*0.1)+actual;
        
        System.out.println("Selecciono la categoria "+categoria+" y su sueldo final es: $"+end);
        }
    }
    

