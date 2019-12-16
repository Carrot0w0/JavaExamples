/*
 * Menú de opciones para usar la clase.
 */

package ejemplo28;

import java.util.*;

public class Ejemplo28 {

    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        Figuras Fig = new Figuras();
        double Radio, Altura;
        int Opcion;
        
        System.out.print("Ingrese los datos que se le pidan:\n\t-Radio: ");
        Radio=xD.nextDouble();
        System.out.print("\t-Altura: ");
        Altura=xD.nextDouble();
        
        System.out.println("\n\nSelecione que desea hacer con ellos:");
        System.out.print("\n\t1 - Area Cilindro\n\t2 - Volumen Cilindro\n\t3 - Area Cono\n\t4 - Volumen Cono\n\t5 - Area Esfera\n\t6 - Volumen Esfera\n\n\t~");
        Opcion=xD.nextInt();
        
        switch(Opcion){
            case 1: 
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("Altura = "+Altura);
                System.out.println("\nEl area del cilindro es: "+Fig.aCilindro(Radio, Altura)+" unidades cuadradas :3");
                break;
            case 2:
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("Altura = "+Altura);
                System.out.println("\nEl volumen del cilindro es: "+Fig.vCilindro(Radio, Altura)+" unidades cubicas :3");
                break;
            case 3:
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("Altura = "+Altura);
                System.out.println("\nEl area del cono es: "+Fig.aCono(Radio, Altura)+" unidades cuadradas :3");
                break;
            case 4:
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("Altura = "+Altura);
                System.out.println("\nEl volumen del cono es: "+Fig.vCono(Radio, Altura)+" unidades cubicas :3");
                break;
            case 5:
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("\nEl area de la esfera es: "+Fig.aEsfera(Radio)+" unidades cuadradas :3");
                break;
            case 6:
                System.out.println("\n\nRadio = "+Radio);
                System.out.println("\nEl volumen de la esfera es: "+Fig.vEsfera(Radio)+" unidades cubicas :3");
                break;    
        }    
    }    
}
