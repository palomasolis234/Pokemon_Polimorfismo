**
 *
 * @author palom
 */
public class BatallaPokemon {
    public static void main (String [] args){
    
        PokemonFuego Charizard  = new PokemonFuego("Charizard", 10);
        PokemonSiniestro Raticate = new PokemonSiniestro("Raticate", 10);
        
        Charizard.atacar("Echar fuego por la boca", Raticate );
        Raticate.atacar("Fuertes mordiscos", Charizard);
                

        Charizard.atacar(0, Raticate);
        System.out.println("\n");
        Raticate.atacar(6, Charizard);
       
    }
}
                
