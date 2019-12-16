/*
 Holo crayolo!
Distancia entre 2 puntos...
 */

package ejemplo7;

import java.util.*;
import java.math.*;

public class Ejemplo7 {

    public static void main(String[] args) {
        float x1,x2,y1,y2,d;
        Scanner s = new Scanner(System.in);
        String line;
        
        System.out.print("Distancia entre 2 puntos\n\nIngresa lo que se te pide:\n\t-x1: ");
        line=s.nextLine();
        x1=Float.parseFloat(line);
        System.out.print("\t-x2: ");
        line=s.nextLine();
        x2=Float.parseFloat(line);
        System.out.print("\t-y1: ");
        line=s.nextLine();
        y1=Float.parseFloat(line);
        System.out.print("\t-y2: ");
        line=s.nextLine();
        y2=Float.parseFloat(line);
        
        d=(float)(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        
        System.out.println("La distancia es de: "+d);
    }
    
}
