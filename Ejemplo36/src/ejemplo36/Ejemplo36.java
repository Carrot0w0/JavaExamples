/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo36;

import java.util.*;

public class Ejemplo36 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        String a, b;
        double c;
        
        System.out.print("Digite un numero: ");
        a=xD.nextLine();
        System.out.print("Digitel otro numero: ");
        b=xD.nextLine();
        
        try{
            c=Double.parseDouble(a)*Double.parseDouble(b);
            System.out.print("El producto es "+c);
        }
        catch(Exception Error){
            System.out.println("Error en los datos");
        }
        //Opcional
        finally{
            System.out.println("Holo, adios .3.");
        }
    }
    
}
