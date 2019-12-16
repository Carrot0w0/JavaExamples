/*
 * Leer una matriz de 5 renglones y 4 columnas. 
 * Mostrar la matriz y calcular la suma de cada columna.
 */

package ejemplo33;

import java.util.*;

public class Ejemplo33 {
    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        int[][] matriz = new int[6][4];
        int x, y, z=0, opcion=0;
        
        System.out.println("Llena la matriz correspondiente:\n");
        for(x=0;x<5;x++){
            for(y=0;y<4;y++){
                System.out.print("Fila "+(x+1)+" ... Columna "+(y+1)+": ");
                matriz[x][y]=xD.nextInt();
            }
        }
        
        do{
            System.out.print("\n\nQue desea hacer?\n1 - Mostrar matriz\n2 - Suma de cada columna\n3 - Salir\n\n\t~");
            opcion=xD.nextInt();
            
            switch(opcion){
                case 1:
                    for(x=0;x<5;x++){
                       System.out.println(matriz[x][0]+"\t"+matriz[x][1]+"\t"+matriz[x][2]+"\t"+matriz[x][3]);                        
                    }
                    break;
                case 2:
                    for(y=0;y<4;y++){
                        for(x=0;x<5;x++){
                            matriz[5][z]=matriz[5][z]+matriz[x][y];                            
                        }
                        z++;            
                    }
                    
                    System.out.println("Matriz llenada");
                    for(x=0;x<5;x++){
                       System.out.println(matriz[x][0]+"\t"+matriz[x][1]+"\t"+matriz[x][2]+"\t"+matriz[x][3]);                        
                    }
                    System.out.println("Sumas respectivas");
                    for(z=0;z<4;z++){
                        System.out.println(matriz[5][z]);
                    }
                    break;
                default:
                    break;
            }
        }while(opcion!=3);
    }
    
}
