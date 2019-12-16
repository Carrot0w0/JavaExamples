package ejemplo30;

public class Enemigo {
    public int a;
    public int b;
    public int c; 
    public int VidaEnemigo;
    public int Vida;
    public int Signo;
    
    public Enemigo(){
        VidaEnemigo=5;
        Vida=3;
        Signo=(int)(Math.random()*10);
        b=(int)(Math.random()*10);
        a=(int)(Math.random()*10);
    }
    
    public int Suma(int ataque){
        c=a+b;
        if(c==ataque)
            VidaEnemigo--;
        else
            Vida--;
        
        return c;
    }
    
    public int Resta(int ataque){
        c=a-b;
        if(c==ataque)
            VidaEnemigo--;
        else
            Vida--;
        
        return c;
    }
    
    public int GetVida(){
        return Vida;
    }
    
    public int GetEnemmigo(){
        return VidaEnemigo;
    }
    
    public char Operacion(int valor){
        char Op=0;
        switch(valor){
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                Op='+';
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                Op='-';
                break;
        }
        Signo=(int)(Math.random()*10);
        return Op;
    }
}
