/*
 * Registrar calificaciones de 3 parciales de un grupo de 5 alumnos.
 1-Mostrar calificaciones y calificacion final
 2-Modificar una calificacion
 3-Obtener el promedio del grupo
 4-Obtener el promedio de un alumno
 5-Salir
 */

package ejemplo35;

import java.util.*;

public class Ejemplo35 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        double[][] calificacion = new double[5][4];
        int x,y,z=0,opcion=0;
        double promedio=0,p=0;
        
        System.out.println("Calificaciones de un grupo de 5 alumnos\n\nIngrese lo que se le pide:\n\n");
        for(x=0;x<5;x++){
            for(y=0;y<3;y++){
                System.out.print("Alumno "+(x+1)+" ... Parcial "+(y+1)+": ");
                calificacion[x][y]=xD.nextDouble();
            }
        }
        
        //Menú de opciones
        do{
            System.out.print("\n\nQue desea hacer?\n1 - Obtener las calicaficaciones y la calificacion final\n2 - Modificar una calificación\n3 - Obtener el promedio del grupo\n4 - Obtener el promedio de un alumno\n5 - Salir\n\n\t~ ");
            opcion=xD.nextInt();
            switch(opcion){
                case 1://Obtener las calificaciones y la calificacion final
                    for(x=0;x<5;x++){//Calificacion final
                        for(y=0;y<3;y++){
                            calificacion[z][3]+=calificacion[x][y];
                        }
                        z++;
                    }
                    System.out.println("\n|\tAlumno\t|\t1\t|\t2\t|\t3\t|\tFinal\t|\n---------------------------------------------------------------------------------");
                    for(x=0;x<5;x++){
                        System.out.println("|\t"+(x+1)+"\t|\t"+calificacion[x][0]+"\t|\t"+calificacion[x][1]+"\t|\t"+calificacion[x][2]+"\t|\t"+((calificacion[x][3])/3)+"\t|");
                    }
                    break;
                case 2://Modificar una calificacion
                    System.out.print("\nModificación de calificaciones...\nIngrese lo que se le pide\n\t-No. de Alumno: ");
                    x=xD.nextInt();
                    System.out.print("\t-No. de parcial para modificar calificación: ");
                    y=xD.nextInt();
                    System.out.print("Calificacion actual: "+calificacion[x-1][y-1]+"\nCalificacion nueva: ");
                    calificacion[x-1][y-1]=xD.nextDouble();
                    break;
                case 3://Obtener el promedio del grupo
                    for(x=0;x<5;x++){
                        p=(calificacion[x][3])/3;
                        promedio+=p;
                    }
                    promedio/=5;
                    System.out.print("\nPromedio grupal: "+promedio);
                    break;
                case 4://Obtener el promedio de un alumno
                    System.out.print("\nPromedio por alumno...\nIngrese lo que se le pide:\n\t-No. de Alumno: ");
                    x=xD.nextInt();
                    for(y=0;y<3;y++){
                        calificacion[x-1][3]+=calificacion[x-1][y];
                    }
                    System.out.println("\nPromedio del alumno "+x+": "+((calificacion[x-1][3])/3));
                    break; 
                //No hay case 5, porque si se presiona 5 solo saldra del ciclo
            }
        }while(opcion!=5);
    }
    
}
