/*
 *Holiwi!
Este programa convierte metros a medidas del sistema ingles
 */

package ejemplo3;

import java.util.*;
public class Ejemplo3 {

    
    public static void main(String[] args) {
        double m,milla,pulg,yarda,pie;
        int opcion=0;
        String line;
        Scanner s = new Scanner(System.in);
        
        System.out.print("CONVERTIDOR DE METROS A SISTEMA INGLES\n\nMetros = ");
        line=s.nextLine();
        m=Double.parseDouble(line);
        System.out.print("\n\nOPCIONES:\n\t1-Millas terrestres\n\t2-Pulgadas\n\t3-Yardas\n\t4-Pies\n\n\t-");
        opcion=s.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("\nHa elegido convertir Metros a Millas terrestres");
                milla=m*0.000621371192;
                System.out.print(m+" Metros equivalen "+milla+" Millas terrestres");
                break;
            case 3:
                System.out.println("\nHa elegido convertir Metros a Yardas");
                yarda=m*1.0936133;
                System.out.print(m+" Metros equivalen "+yarda+" Yardas");
                break;
            case 4:
                System.out.println("\nHa elegido convertir Metros a Pies");
                pie=m*3.2808399;
                System.out.print(m+" Metros equivalen "+pie+" Pies");
                break;
            case 2:
                System.out.println("\nHa elegido convertir Metros a Pugladas");
                pulg=m*39.3700787;
                System.out.print(m+" Metros equivalen "+pulg+" Pulgadas");
                break;
        }
        
    }
    
}
