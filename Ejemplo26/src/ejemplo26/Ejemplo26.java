/*
 * Calculadora con clases
 */

package ejemplo26;

import java.util.*;

public class Ejemplo26 {

    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        Operaciones xd = new Operaciones();      
        double c;
        
        System.out.println("Calculadora de sumas, restas, multiplicaciones y divisiones :v\n\nIngresa tu expresion matematica: \t");
        xd.expresion=lol.nextLine();
        
        xd.Simbolo();
        
        xd.a=Double.parseDouble(xd.expresion.substring(0,xd.indice));
        xd.b=Double.parseDouble(xd.expresion.substring(xd.x+1));
        
        switch(xd.simbolo){
            case '+':
                c=xd.Suma();
                System.out.println("Resultado: "+c);
                break;
            case '-':
                c=xd.Resta();
                System.out.println("Resultado: "+c);
                break;
            case '*':
                c=xd.Multiplicacion();
                System.out.println("Resultado: "+c);
                break;
            case '/':
                c=xd.Division();
                System.out.println("Resultado: "+c);
                break;
        }
    }
    
}
