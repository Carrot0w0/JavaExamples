/*
Holi!
Área de un cirulo
 */

package ejemplo5;

import java.util.*;
import java.lang.*;

public class Ejemplo5 {

    public static void main(String[] args) {
        double area, radio;
        Scanner s = new Scanner(System.in);
        String line;
        
        System.out.print("Area de un circulo...\n\nRadio: ");
        line=s.nextLine();
        radio=Double.parseDouble(line);
        
        area=Math.PI*Math.pow(radio, 2);
        
        System.out.println("El area de un circulo con radio "+radio+" es de: "+area);
    }
    
}
