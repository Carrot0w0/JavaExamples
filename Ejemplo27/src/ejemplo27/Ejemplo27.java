/*
 * Programa de un #ito
 */

package ejemplo27;

import java.util.*;

public class Ejemplo27 {

    public static void main(String[] args) {
        Scanner Felino = new Scanner(System.in);
        double x=0;
        Gatito gato = new Gatito();
        int opcion;
        
        System.out.print("Hola! Quieres jugar con un gato?\n\nPara empezar a jugar ingrese el peso incial del gato:\n\t-Peso: ");
        gato.peso=Felino.nextDouble();
        
        x=gato.peso;
        
            while(x>=5 && x<=20){
                System.out.print("\n\nQue desea hacer?\n\t1 - Ejercicio\n\t2 - Comida\n\n\t-");
                opcion=Felino.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.print("Cuanto de ejercicio desea darle?\n\t1 - 30min\n\t2 - 1hr\n\t-");
                        gato.ejercicio=Felino.nextInt();
                        gato.Ejercicio();
                        System.out.print("El peso del gato es: "+gato.GetPeso());
                        break;
                    case 2:
                        System.out.print("Que comida desea darle?\n\t1 - Carne\n\t2 - Verduras\n\t3 - Leche\n\t-");
                        gato.comida=Felino.nextInt();
                        gato.Comida();
                        System.out.print("El peso del gato es: "+gato.GetPeso());
                        break;
                }
                x=gato.peso;
            }
            System.out.println("\n\nEl gato paso a mejor vida de la que tu le dabas");
        
    }
    
}
