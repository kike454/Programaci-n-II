package pr2.org;

import java.util.*;
public class Mochila<K,V>
{

    private Set<V> pokedex;
    private Map<K,List<V>> entrenadores;

    public void RegistroPokemon() {
        this.pokedex = new TreeSet<V>();
        this.entrenadores = new HashMap<K,List<V>>();
    }

    public void addPokemonToPokedex(V pokemon) {
        this.pokedex.add(pokemon);
    }

    public void addEntrenador(K entrenador, List<V> pokemons) {

        for (V pokemon : pokemons) {
            if (!this.pokedex.contains(pokemon)) return;
        }
        this.entrenadores.put(entrenador, pokemons);
    }

    public Set<V> getPokedex() { return this.pokedex; }
    public Map<K,List<V>> getEntrenadores() { return this.entrenadores; }

}
