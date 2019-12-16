/*
 * Ingresar tipo de silla, cantidad de sillas.
    10%, 15%, 20% por cada 5 sillas, desde la 6ta a precio normal :v
 */

package ejemplo16;

import java.util.*;

public class Ejemplo16 {

    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        char tipo;
        int cantidad, r;
        double precio, descuento;
        
        System.out.print("Venta de sillas\n\nIngresa lo que se te pide: \nCantidad de sillas: ");
        cantidad=lol.nextInt();
        System.out.print("\nTipo de silla: \n\t-A\n\t-B\n\t-C\n\t...");
        tipo=lol.next().charAt(0);
        
        r=cantidad/5;        
        
        switch(tipo){
            case 'A':
            case 'a':    
                if(r>0)
                {
                    descuento=((r*5)*0.1)*100;
                    precio=(50*cantidad)-descuento;
                }
                else{
                    descuento=0;
                    precio=50*cantidad;
                }
                System.out.println("Total a pagar: $"+precio+"\nDescuento (10%): $"+descuento+"\nSillas compradas: "+cantidad);
                break;
            case 'B':
            case 'b':    
                if(r>0)
                {
                    descuento=((r*5)*0.15)*100;
                    precio=(70*cantidad)-descuento;
                }
                else{
                    descuento=0;
                    precio=70*cantidad;
                }
                System.out.println("Total a pagar: $"+precio+"\nDescuento (15%): $"+descuento+"\nSillas compradas: "+cantidad);
                break; 
            case 'C':
            case 'c':    
                if(r>0)
                {
                    descuento=((r*5)*0.2)*100;
                    precio=(100*cantidad)-descuento;
                }
                else{
                    descuento=0;
                    precio=100*cantidad;
                }
                System.out.println("Total a pagar: $"+precio+"\nDescuento (20%): $"+descuento+"\nSillas compradas: "+cantidad);
                break;
        }
    }
    
}
