*
 * @author palom
 */
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<movimiento> movimientos = new ArrayList<>();

 /**   
 * 
 */
public ListaMovimientos() {

// Movimientos de tipo Fuego Charmeleon
movimientos.add(new Movimiento (nombre: "Ascuas Ember", puntosDeAtaque:40, Tipo. TIERRA, pp:25));
movimientos.add(new Movimiento (nombre: "Colmillo Ígneo Fire Fang", puntosDeAtaque:65, Tipo. TIERRA, pp:15));
movimientos.add(new Movimiento (nombre: "Lanzallamas Flamethrower", puntosDeAtaque:40, Tipo. TIERRA, pp:20));
movimientos.add(new Movimiento (nombre: "Buena Baza Assurance", puntosDeAtaque:90, Tipo. TIERRA, pp:15));
movimientos.add(new Movimiento (nombre: "Giro Fuego Fire Spin", puntosDeAtaque:35, Tipo. TIERRA, pp:15));



// Movimientos de tipo sieniestro PokéDex Nacional
movimientos.add(new Movimiento (nombre: "Finta Feint Attack", puntosDeAtaque:60, Tipo. SINESTRO, pp:20));
movimientos.add(new Movimiento (nombre: "Buena Baza Assurance", puntosDeAtaque:60, Tipo. SINESTRO, pp:10));
movimientos.add(new Movimiento (nombre: "Persecución Pursuit", puntosDeAtaque:40, Tipo. TIERRA, pp:20));
movimientos.add(new Movimiento (nombre: "Buena Baza Assurance", puntosDeAtaque:70, Tipo. TIERRA, pp:15));




// Metodo que devuelve el movimiento buscando el nombre 
Codeium: Refactor | Explain 
public Movimiento buscarMovimientoPorNombre(String nombre) {
    for (Movimiento movimiento: movimientos) {
    if (movimiento.getNombre().equals (nombre)) { return movimiento;
      return null;
     }

}

        return null;
    }
    

   
    
}
