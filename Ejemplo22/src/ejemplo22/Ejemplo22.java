/*
 * Equipo de futbol, determinar su efectividad con 10 juegos.
 * Resultado = GolesAnotados y GolesRecibidos
 * JJ = JuegosJugados
 * JG = JuegosGanados
 * JE = JuegosEmpatados
 * JP = JuegosPerdidos
 * JF = JuegosFavor
 * JC = JuegosContra
 * DIF = Diferencia
 * PTS = Puntos
 * Porcentual
 */

package ejemplo22;

import java.util.*;

public class Ejemplo22 {

    public static void main(String[] args) {
        int ge=0, gr=0, gf=0, gc=0, pts=0, dif=0, porcentual=0, jj=1, jg=0, jp=0, je=0;
        Scanner lol = new Scanner(System.in);
        
        System.out.println("Efectividad de un equipo...");
        
        do{
            System.out.print("Goles del juego #"+jj+":\n\tEquipo: ");
            ge=lol.nextInt();
            System.out.print("\tRival: ");
            gr=lol.nextInt();
            
            gf=gf+ge;
            gc=gc+gr;
            
            if(ge>gr){
                jg++;
                pts=pts+3;
            }
            else{
                if(ge<gr){
                    jp++;
                }
                else{
                    if(ge==gr){
                        je++;
                        pts=pts+1;
                    }
                }
            }                  
            
        }while(jj<=10);
    }
    
}
