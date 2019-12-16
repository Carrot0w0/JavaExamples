package ejemplo28;

public class Figuras {
    private double volumen;
    private double area;
    
    /*public Figuras(double vol, double a){
        
    }*/
    
    public double aCilindro(double radio, double altura){
        area=2*Math.PI*(altura+radio);
        return area;
    }
    
    public double vCilindro(double radio, double altura){
        volumen=Math.PI*Math.pow(radio,2)*altura;
        return volumen;
    }
    
    public double aCono(double radio, double altura){
        double generatriz;
        generatriz=Math.sqrt(Math.pow(altura,2)+Math.pow(radio,2));
        area=Math.pow(Math.PI,2)+Math.PI*radio*generatriz;
        System.out.print("Generatriz = "+generatriz);
        return area;
    }
    
    public double vCono(double radio, double altura){
        volumen=(Math.PI*Math.pow(radio,2)*altura)/3;
        return volumen;
    }
    
    public double aEsfera(double radio){
        area=4*Math.PI*Math.pow(radio,2);
        return area;
    }
    
    public double vEsfera(double radio){
        volumen=(4*Math.PI/3)*Math.pow(radio,3);
        return volumen;
    }
}
