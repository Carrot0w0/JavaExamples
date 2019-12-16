/*
 Holi!
 Ecuaciones cuadraticas... tururú(8)♪♫
 */

package ejemplo6;

import java.util.*;
import java.math.*;

public class Ejemplo6 {

    
    public static void main(String[] args) {
       float a,b,c,x1,x2;
       Scanner s = new Scanner(System.in);
       String line;
       
       System.out.print("Ecuaciones Cuadraticas...\n\nIngrese los datos que se pidan:\n\t-ax^2: ");
       line=s.nextLine();
       a=Float.parseFloat(line);
       System.out.print("\t-bx: ");
       line=s.nextLine();
       b=Float.parseFloat(line);
       System.out.print("\t-c: ");
       line=s.nextLine();
       c=Float.parseFloat(line);
       
       x1=(float)(-(b)+Math.sqrt(Math.pow(b,2)+(4*a*c)))/2;
       x2=(float)(-(b)-Math.sqrt(Math.pow(b,2)+(4*a*c)))/2;
       
       System.out.println("\nResultados:\n\t-"+x1+"\n\t-"+x2);
    }
    
}
