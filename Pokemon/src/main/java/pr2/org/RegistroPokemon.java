package pr2.org;
import java.util.*;

public class RegistroPokemon<K,V>
{
    private Set<V> pokedex;
    private Map<K,List<V>> entrenadores;

    public RegistroPokemon() {
        this.pokedex = new TreeSet<V>();//para poder meter pokemon, los tienes que compararlo,mantiene los elementos ordenados
        this.entrenadores = new HashMap<K,List<V>>();
    }

    public void addPokemonToPokedex(V pokemon) {
        this.pokedex.add(pokemon);
    }

    public void addEntrenador(K entrenador, List<V> pokemons) {

        for (V pokemon : pokemons) {
            if (!this.pokedex.contains(pokemon)) return;//busqueda de pokemon si lo teniamos anteriromente
        }
        this.entrenadores.put(entrenador, pokemons);
    }

    public Set<V> getPokedex() { return this.pokedex; }
    public Map<K,List<V>> getEntrenadores() { return this.entrenadores; }

}
