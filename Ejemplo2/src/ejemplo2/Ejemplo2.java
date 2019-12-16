/*
 Holo crayolo!
Este programa calcula el área de un triángulo
 */

package ejemplo2;

import java.util.*;
public class Ejemplo2 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner s = new Scanner(System.in);
        String linea;
        
        System.out.print("Area de un triangulo...\n\nIngrese la base: ");
        linea=s.nextLine();
        base=Double.parseDouble(linea);        
        System.out.print("Ingrese la altura: ");
        linea=s.nextLine();
        altura=Double.parseDouble(linea);
        
        area=(base*altura)/2;
        
        System.out.println("El area del triangulo con base "+base+" y altura "+altura+" es: "+area);
    }
    
}
