/*
 * Juego matematico por turnos.
 */

package ejemplo30;

import java.util.*;
public class Ejemplo30 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        Enemigo enemy = new Enemigo();
        int respuesta,x;
        char n;
        
        System.out.print("Bienvenido a mi juego por turnos\nEl objetivo de este juego es vencer al enemigo escribiendo la respuesta correcta 5 veces para derrotarlo\n\n");
        
        do{
            n=enemy.Operacion(enemy.Signo);
            System.out.print("\nEnemigo ataca:\n"+enemy.a+" "+n+" "+enemy.b+" = ");
            respuesta=xD.nextInt();
            
            if(n=='+')
                x=enemy.Suma(respuesta);
            if(n=='-')
                x=enemy.Resta(respuesta);
            
            System.out.println("Tu vida: "+enemy.GetVida()+"\nVida enemigo:"+enemy.GetEnemmigo());
        }while(enemy.Vida>0 && enemy.VidaEnemigo>0);
    }
    
}
