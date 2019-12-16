/*
 Holi!
Calcular seno, coseno, tangente de un angulo, luego usar el seno y mostrar el valor en grados...
 */

package ejemplo8;

import java.util.*;
import java.math.*;

public class Ejemplo8 {

    public static void main(String[] args) {
        double grados, seno, coseno, tangente, seno2, ang_rad, ang_grad;
        Scanner s = new Scanner(System.in);
        String line;
        
        System.out.print("Calculo del Seno, Coseno y Tangente de un angulo... \n\n\t-Grados: ");
        line=s.nextLine();
        grados=Double.parseDouble(line);
                
        seno=Math.sin(Math.toRadians(grados));
        coseno=Math.cos(Math.toRadians(grados));
        tangente=Math.tan(Math.toRadians(grados));
        
        System.out.println("\nValores:\n\t-Seno: "+seno+"\n\t-Coseno: "+coseno+"\n\t-Tangente: "+tangente);
        System.out.print("\nConvertir Seno a Grados\n\n\t-Valor del Seno: ");
        line=s.nextLine();
        seno2=Double.parseDouble(line);
        
        ang_rad=Math.asin(seno2);
        ang_grad=Math.toDegrees(ang_rad);
        
        System.out.print("Grados: "+ang_grad);
        
    }
    
}
