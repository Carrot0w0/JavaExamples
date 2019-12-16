/*
 * Leer una matriz de 3 x 3
 * Imprimir la matriz
 * Obtener la suma de cada renglon, columna y diagonal principal.
 */

package ejemplo34;

import java.util.*;

public class Ejemplo34 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        int[][] cuadrado = new int[4][4];
        int x,y,z=0;
        
        //Llenar la matriz
        System.out.println("Escriba loque se le indique:\n\n");
        for(x=0;x<3;x++){
            for(y=0;y<3;y++){
                System.out.print("Fila "+(x+1)+"\tColumna "+(y+1)+": ");
                cuadrado[x][y]=xD.nextInt();
            }
        }
        
        //Mostrar la matriz
        System.out.println("\n\nMuestra de la matriz:\n------------------------------------");
        for(y=0;y<3;y++){
            System.out.println(cuadrado[y][0]+"\t|\t"+cuadrado[y][1]+"\t|\t"+cuadrado[y][2]);
        }
        
        //Suma de filas, columnas y diagonal principal
        System.out.println("Sumas de filas, columnas y diagonal principal:");        
        for(x=0;x<3;x++){
            for(y=0;y<3;y++){
                cuadrado[z][3]+=cuadrado[x][y];//Suma de filas
                cuadrado[3][z]+=cuadrado[y][x];//Suma de columnas
            }
            z++;
            cuadrado[3][3]+=cuadrado[x][x];//Suma de la diagonal principal
        }  
        //Impresion de las sumas
        System.out.println("\n\n------------------------------------------------------------------------\nImpresion de las sumas con todo y matriz\n------------------------------------------------------------------------\n1\t|\t2\t|\t3\t|\tSuma de filas\n------------------------------------------------------------------------");
        for(x=0;x<3;x++){
            System.out.println(cuadrado[x][0]+"\t|\t"+cuadrado[x][1]+"\t|\t"+cuadrado[x][2]+"\t|\t"+cuadrado[x][3]);
        }
        System.out.println("\n\n------------------------------------------------------------------------\nSuma de columnas y diagonal principal\n------------------------------------------------------------------------");
        System.out.println(cuadrado[3][0]+"\t|\t"+cuadrado[3][1]+"\t|\t"+cuadrado[3][2]+"\t|\t"+cuadrado[3][3]);
    }
    
}
