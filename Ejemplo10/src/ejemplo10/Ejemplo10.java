/*
 * Calcular:
hipotenusa
seno, coseno, tangente angulo a
angulo a y c

Leer:
cateto adyacente
cateto opuesto
 */

package ejemplo10;

import java.util.*;
import java.lang.*;

public class Ejemplo10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c,A,C,cos,sin,tan;
        String line;
        
        System.out.print("Ingresa lo que se te pide: \n\t-Cateto opuesto: ");
        line=s.nextLine();
        a=Double.parseDouble(line);
        System.out.print("\t-Cateto adyacente: ");
        line=s.nextLine();
        c=Double.parseDouble(line);
        
        b=Math.sqrt(Math.pow(a,2)+Math.pow(c, 2));
        
        sin=a/b;
        cos=c/b;
        tan=a/c;
        
        A=Math.asin(sin);
        C=Math.asin(cos);
        
        System.out.print("Resultados:\n\t-Hipotenusa: "+b+"\n\t-Seno A: "+sin+"\n\t-Coseno A: "+cos+"\n\t-Tangente A: "+tan+"\n\t-Angulo A: "+Math.toDegrees(A)+"°\n\t-Angulo C: "+Math.toDegrees(C)+"°");
        
    }
    
}
