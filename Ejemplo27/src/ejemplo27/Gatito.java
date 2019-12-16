package ejemplo27;

public class Gatito {
    public double peso;
    public int comida;
    public int ejercicio;
    public String vida;
    
    //Métodos
    public void Comida(){
        if(peso>=5 && peso<=20){
            switch(comida){
                case 1:
                    peso=peso+0.5;
                    break;
                case 2:
                    peso=peso+0.25;
                    break;
                case 3:
                    peso=peso+0.1;
                    break;  
                default:
                    System.out.print("\nNo le has dado nada de comer\n");
                    break;
            }
        }
    }
    
    public void Ejercicio(){
        if(peso>=5 && peso<=20){
             switch(ejercicio){
                 case 1:
                    peso=peso-0.3;
                    break;
                case 2:
                    peso=peso-0.5;
                    break;
                default:
                    System.out.print("\nNo le has dado nada de ejercicio\n");
                    break;
            }
        }
    }
      
    public double GetPeso(){
        return peso;
    }
}
