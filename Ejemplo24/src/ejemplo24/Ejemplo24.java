package ejemplo24;

import java.util.*;

public class Ejemplo24 {

    public static void main(String[] args) {
        Scanner holi = new Scanner(System.in);
        Complemento ObjOperacion = new Complemento();        
        double Res=0;
        
        System.out.print("Digite el primer numero: ");
        ObjOperacion.Op1=holi.nextDouble();
        System.out.print("Digite el segundo numero: ");
        ObjOperacion.Op2=holi.nextDouble();
        
        Res=ObjOperacion.Suma();
        System.out.println("La suma de los numeros es "+Res);
        
        Res=ObjOperacion.Multiplicacion();
        System.out.println("La multiplicacion de los numeros es "+Res);
    }
    
}
