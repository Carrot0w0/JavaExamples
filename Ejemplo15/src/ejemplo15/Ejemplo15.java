/*
 * Calculadora
Extraer el operando, meterlo a un switch y valorar todo :v
 */

package ejemplo15;

import java.util.*;

public class Ejemplo15 {
    
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        String expresion,a,b2;
        char operando=0;
        int indice,b;        
        double c,x,y;
        
        System.out.println("Calculadora de sumas, restas, multiplicaciones y divisiones :v\n\nIngresa tu expresion matematica: \t");
        expresion=lol.nextLine();
        
        indice=expresion.indexOf("+");
        b=expresion.lastIndexOf("+");
        if(indice>=0)
            operando=expresion.charAt(indice);
        else {
            indice=expresion.indexOf("-");
            b=expresion.lastIndexOf("-");
            if(indice>=0)
                operando=expresion.charAt(indice);
            else{
                indice=expresion.indexOf("*");
                b=expresion.lastIndexOf("*");
                if(indice>=0)
                    operando=expresion.charAt(indice);
                else{
                    indice=expresion.indexOf("/");
                    b=expresion.lastIndexOf("/");
                    if(indice>=0)
                        operando=expresion.charAt(indice);
                }
            }
        }
        
        a=expresion.substring(0,indice);
        b2=expresion.substring(b+1);
        x=Double.parseDouble(a);
        y=Double.parseDouble(b2);
        
        switch(operando){
            case '+':
                c=x+y;
                System.out.println("Resultado: "+c);
                break;
            case '-':
                c=x-y;
                System.out.println("Resultado: "+c);
                break;
            case '*':
                c=x*y;
                System.out.println("Resultado: "+c);
                break;
            case '/':
                c=x/y;
                System.out.println("Resultado: "+c);
                break;
        }         
    }    
}
