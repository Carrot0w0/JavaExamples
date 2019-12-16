/*
 * Leer:
-Peso
-Altura
-Sexo
 * de 20 personas de un estado de la republica, obtener el  promedio de altura 
y peso de femenino y masculino :v
 */

package ejemplo20;

import java.util.*;

public class Ejemplo20 {
    public static void main(String[] args) {
        double peso, altura, pAlturaF, pPesoF, pAlturaM, pPesoM, aFP=0, aFA=0, aMP=0, aMA=0;
        char sexo;
        int cMasculino=0, cFemenino=0;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Bienvenidos al estado de los Sueños\n\nNecesitamos hacer un censo de salud y por eso necesitamos que ingrese los siguientes datos:");
                
        for(int i=1;i<=20;i++){
            System.out.println("\nPersona "+i);
            System.out.print("\t-SEXO (F - Femenino, M - Masculino): ");
            sexo=lol.next().charAt(0);
            System.out.print("\t-Peso: ");
            peso=lol.nextDouble();
            System.out.print("\t-Altura: ");
            altura=lol.nextDouble();
            
            if(sexo=='F'){
                cFemenino++;
                aFP=aFP+peso;
                aFA=aFA+altura;                
            }
            if(sexo=='M'){
                cMasculino++;
                aMP=aMP+peso;
                aMA=aMA+altura;
            }
        }
        
        pAlturaF=aFA/cFemenino;
        pAlturaM=aMA/cMasculino;
        
        pPesoF=aFP/cFemenino;
        pPesoM=aMP/cMasculino;
        
        System.out.println("\n\n\nRESULTADOS...");
        System.out.println("Total de hombres: "+cMasculino+"\nPromedio de Altura: "+pAlturaM+"\nPromedio de Peso: "+pPesoM);
        System.out.println("\nTotal de mujeres: "+cFemenino+"\nPromedio de Altura: "+pAlturaF+"\nPromedio de Peso: "+pPesoF);
    }
    
}
