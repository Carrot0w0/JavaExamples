/*
 * Temperaua promedio mensual. Menu de opciones:
1-Promedio de las temperaturas del año
2-Mes mas caluroso del año
3-Mes mas frio del año
4-Lista de meses que estuvieron por encima del promedio
5-Lista de los meses que estuvieron por debajo del promedio
6-Listar las temperaturas del año
7-Modificar una temperatura
8-Salir
 */

package ejemplo32;

import java.util.*;

public class Ejemplo32 {

    private static double[] temperatura = new double[12];
    private static String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static double promedio=0;
    
    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        int Opcion=0, x;
        
        System.out.print("Temperaturas aporoximadas de cada mes\n\nIngresa las temperaturas del mes correspondiente\n");
        for(x=0;x<12;x++){
            System.out.print("-"+mes[x]+": ");
            temperatura[x]=xD.nextDouble();
        }
        
        do{
            System.out.println("\n\nOPCION:\n1 - Promedio de las temperaturas del año\n2 - Mes mas caluroso del año\n3 - Mes mas frio del año\n4 - Lista de meses que estuvieron por encima del promedio\n5 - Lista de meses que estuvieron por debajo del promedio\n6 - Listar las temperaturas del año\n7 - Modificar una temperatura\n8 - Salir\n\t~");
            Opcion=xD.nextInt();
        
            switch(Opcion){
                case 1:
                    Promedio();
                    break;
                case 2:
                    Caluroso();                    
                    break;
                case 3:
                    Frio();
                    break;
                case 4:
                    MayorPromedio();
                    break;
                case 5:
                    MenorPromedio();
                    break;
                case 6:
                    Listar();
                    break;
                case 7:
                    Modificar();
                    break;
                case 8:
                    break;
            }
        }while(Opcion!=8);        
    }
    
    public static void Promedio(){
        double suma=0;
        int x;
        
        for(x=0;x<12;x++){
            suma=suma+temperatura[x];
        }
        promedio=suma/12;
        System.out.println("\nPromedio de las temperaturas: "+promedio);
    }
    
    public static void Caluroso(){
        int mesMayor=0,x;
        double may=temperatura[0];
        
        for(x=0;x<12;x++){
            if(temperatura[x]>=may){
                may=temperatura[x];
                mesMayor=x;
            }
        }
        System.out.println("\nMes con la temperatura mas calurosa: "+mes[mesMayor]+"\nCon una temperatura correspondiente a: "+may);
    }
    
    public static void Frio(){
        int mesMenor=0,x;
        double men=temperatura[0];
        
        for(x=0;x<12;x++){
            if(temperatura[x]<=men){
                men=temperatura[x];
                mesMenor=x;
            }
        }
        System.out.println("\nMes con la temperatura mas fria: "+mes[mesMenor]+"\nCon una temperatura correspondiente a: "+men);
    }
    
    public static void MayorPromedio(){
        int x;
        
        System.out.println("\nTemperaturas mayores al promedio de "+promedio);
        for(x=0;x<12;x++){
            if(promedio<temperatura[x]){
                System.out.println("Mes "+mes[x]+"\tTemperatura "+temperatura[x]);
            }
        }
    }
    
    public static void MenorPromedio(){
        int x;
        
        System.out.println("\nTemperaturas menores al promedio de "+promedio);
        for(x=0;x<12;x++){
            if(promedio>temperatura[x]){
                System.out.println("Mes "+mes[x]+"\tTemperatura "+temperatura[x]);
            }
        }
    }
    
    public static void Listar(){
        int x;
        for(x=0;x<12;x++){
            System.out.println("-"+mes[x]+" ... Temperatura: "+temperatura[x]);
        }
    }
    
    public static void Modificar(){
        Scanner xD = new Scanner(System.in);
        int x,n,o;
        
        System.out.print("\nQue mes quieres modificar?\n1-Enero\n2-Febrero\n3-Marzo\n4-Abril\n5-Mayo\n6-Junio\n7-Julio\n8-Agosto\n9-Septiembre\n10-Octubre\n11-Noviembre\n12-Diciembre\n\n\t...");
        n=xD.nextInt();
        
        System.out.print("\nVas a modificar la temperatura del mes "+mes[n]+"\nTemperatura actual "+temperatura[n]+"\nNueva temperatura ");
        temperatura[n]=xD.nextDouble();
        System.out.print("Temperatura registrada. Desea mostrar todas las temperaturas? (1 para SI, 2 para NO): ");
        o=xD.nextInt();
        if(o==1){
            for(x=0;x<12;x++){
                System.out.println(temperatura[x]);
            }
        }
    }
}
