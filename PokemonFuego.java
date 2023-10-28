import pokemon.ListaMovimientos;

public class PokemonFuego extends Pokemon{
    Pokemon pokemon;
    public PokemonFuego(String nombre, int nivel) {
        super(nombre, Tipo.FUEGO, nivel);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Ascuas Ember"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Colmillo Ígneo Fire Fang"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Lanzallamas Flamethrower"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Buena Baza Assurance"));
        setMovimientos(4, listaMovimientos.buscarMovimientoPorNombre("Giro Fuego Fire Spin"));
        
}
/**
 * @param pokemon
 * @return
 */
public double obtenerEfectividad(Pokemon pokemon){
    double efectividad = 1.0;

    if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 2.0;
    if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
    if(pokemon.getTipo()== Tipo.ROCA) efectividad = 0.5;
    if(pokemon.getTipo()== Tipo.HIELO) efectividad = 2.0;
    if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 0.5;
    
return efectividad;

public double CalcularDanio(Pokemon pokemon){
    
    calculaDanio(int danio) 
    recibirAtaque(String movimiento)
     atacar(String movimiento, Pokemon pokemon)
    Atacar();
    int Defensa(); 
    intAtaque especia();
     int Defensa especial(); 
    int Velocidad();
    int Nivel(); 
    




}
}
    
