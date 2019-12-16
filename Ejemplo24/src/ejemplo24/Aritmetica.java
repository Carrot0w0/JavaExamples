package ejemplo24;

public class Aritmetica {
    //Declarar los atributos
    public double Op1;
    public double Op2;
    
    //Constructor
    public Aritmetica(){
        Op1=0;
        Op2=0;
    }
    
    public Aritmetica(double valor1){
        Op1=valor1;
        Op2=0;
    }
    
    public Aritmetica(double valor1, double valor2){
        Op1=valor1;
        Op2=valor2;
    }
    
    //Métodos
    public double Suma(){
        double resultado;  
        
        resultado=Op1+Op2;        
        
        return resultado;
    }
    
    public double Resta(){
        double Resultado;
        
        Resultado=Op1-Op2;
        
        return Resultado;
    }
}
