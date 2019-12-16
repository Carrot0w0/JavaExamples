/*
 Leer Newtons y angulo de inclinacion.. Encontrar los componentes rectangulares en x y en y de la fuerza
 */

package ejemplo9;

import java.util.*;
import java.lang.*;

public class Ejemplo9 {

    public static void main(String[] args) {
        double newtons, angulo, com_x, com_y;
        Scanner s = new Scanner(System.in);
        String line;
        
        System.out.print("Ingresa lo que se te pide:\n\n-Magnitud en Newtons: ");
        line=s.nextLine();
        newtons=Double.parseDouble(line);
        System.out.print("-Angulo de inclinacion en grados: ");
        line=s.nextLine();
        angulo=Double.parseDouble(line);
        
        com_x=newtons*(Math.cos(Math.toRadians(angulo)));
        com_y=newtons*(Math.sin(Math.toRadians(angulo)));
        
        System.out.print("\n\nComponentes rectangulares:\n\t-X: "+com_x+"\n\t-Y: "+com_y);
       
    }
    
}
