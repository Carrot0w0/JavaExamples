/*
 * Registrar temperaturas de la semana.
Indicar la mayor, menos y promedio (indique el dia)
 */

package ejemplo31;

import java.util.*;

public class Ejemplo31 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        double[] temperatura = new double[7];
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
        double promedio=0, may, men;
        int x, diaMenor, diaMayor;
        
        System.out.println("Registro de las temperaturas de una semana~~\nIngrese lo que se le pida:\n");
        
        for(x=0;x<7;x++){
            System.out.print("Temperatura Dia "+dias[x]+": ");
            temperatura[x]=xD.nextDouble();
        }
        
        System.out.println("\n\nMuestra de temperaturas");
        for(x=0;x<7;x++){
            System.out.println("Dia "+dias[x]+" ... Temperatura "+temperatura[x]);
        }
        
        may=temperatura[0]; diaMayor=0;
        men=temperatura[0]; diaMenor=0;
        for(x=0;x<7;x++){
            if(temperatura[x]>=may){
                may=temperatura[x];
                diaMayor=x;
            }
            if(temperatura[x]<=men){
                men=temperatura[x];
                diaMenor=x;
            }
            promedio+=temperatura[x];
        }
        promedio/=7;
        
        System.out.println("\n\nTemperatura mayor: "+may+"\tDia correspondiente: "+dias[diaMayor]);
        System.out.println("Temperatura menor: "+men+"\tDia correspondiente: "+dias[diaMenor]);
        System.out.println("Promedio de temperaturas: "+promedio);
    }
    
}
