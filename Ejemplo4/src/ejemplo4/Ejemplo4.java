/*
 *Holiwi!
Este programa convierte los grados centigrados a grados farenheit y kelvin
 */

package ejemplo4;

import java.util.*;
public class Ejemplo4 {

    
    public static void main(String[] args) {
        double c,f,k;
        int opcion=0;
        String line;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Holiwi!!\n\n\tCONVERTIDOR DE GRADOS CELSIUS\n\nGrados Celsius: ");
        line=s.nextLine();
        c=Double.parseDouble(line);
        
        System.out.print("\n\nOPCIONES:\n\t1-Farenheit\n\t2-Kelvin\n\t-");
        opcion=s.nextInt();
        
        if(opcion==1){
            System.out.println("Ha elegido convertir Celsius a Farenheit");
            f=c*1.8+32;
            System.out.println(c+" grados Celsius equivalen a "+f+" grados Farenheit");
        }
        if(opcion==2){
            System.out.println("Ha elegido convertir Celsius a Kelvin");
            k=c+273.15;
            System.out.println(c+" grados Celsius equivalen a "+k+" grados Kelvin");
        }
    }
    
}
