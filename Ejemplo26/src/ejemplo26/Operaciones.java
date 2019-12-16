package ejemplo26;

public class Operaciones {
    public double a;
    public double b;
    public char simbolo;
    public int indice;
    public String expresion;
    public int x;
        
    public char Simbolo(){
        indice=expresion.indexOf("+");
        x=expresion.lastIndexOf("+");
        if(indice>=0)
            simbolo=expresion.charAt(indice);
        else {
            indice=expresion.indexOf("-");
            x=expresion.lastIndexOf("-");
            if(indice>=0)
                simbolo=expresion.charAt(indice);
            else{
                indice=expresion.indexOf("*");
                x=expresion.lastIndexOf("*");
                if(indice>=0)
                    simbolo=expresion.charAt(indice);
                else{
                    indice=expresion.indexOf("/");
                    x=expresion.lastIndexOf("/");
                    if(indice>=0)
                        simbolo=expresion.charAt(indice);
                }
            }
        }
        
        return simbolo;
    }
    
    public double Suma(){
        double res;
        res=a+b;
        return res;
    }
    
    public double Resta(){
        double res;
        res=a-b;
        return res;
    }
    
    public double Multiplicacion(){
        double res;
        res=a*b;
        return res;
    }
    
    public double Division(){
        double res;
        res=a/b;
        return res;
    }
}
