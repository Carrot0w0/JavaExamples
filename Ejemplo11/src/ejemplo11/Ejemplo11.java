/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo11;

import java.util.*;

public class Ejemplo11 {

    public static void main(String[] args) {
        String nombre,miNom;
        int espacio;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite su nombre: ");
        nombre=s.nextLine();
        
        System.out.println("Su nombre tiene "+nombre.length()+" caracteres :v");
        System.out.println("Su nombre inicia con "+nombre.charAt(0));
        System.out.println("La tercera letra de su nombre es: "+nombre.charAt(2));
        System.out.println("Su nombre tiene una A en la posicion: "+nombre.indexOf("A",5));
        System.out.println("Su nombre con las A remplazadas: "+nombre.replace('A','O'));
        
        espacio=nombre.indexOf(" ",0);
        miNom=nombre.substring(0,espacio);
        System.out.println("Solo su nombre: "+miNom);
        
        System.out.println("Su nombre en Mayusculas "+miNom.toUpperCase()+" :v");
        System.out.println("Su nombre en Minusculas "+miNom.toLowerCase()+" :v");
    }
    
}
