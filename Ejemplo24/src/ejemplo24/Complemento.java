package ejemplo24;

public class Complemento extends Aritmetica {
    //Automaticamente heredo los atributos y metodos anteriores
    //Solo crearemos metodos
    
    public double Multiplicacion(){
        double Res;
        
        Res=Op1*Op2;
        
        return Res;
    }
    
    public double Division(){
        double res;
        
        res=Op1/Op2;
        
        return res;
    }
}
