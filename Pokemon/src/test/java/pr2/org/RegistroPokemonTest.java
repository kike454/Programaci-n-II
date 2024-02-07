package pr2.org;

import static org.junit.Assert.assertTrue;
import java.util.*;
import  static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class RegistroPokemonTest
{
    class Pokemon implements Comparable<Pokemon> {
        int code;
        String name;

        public Pokemon(int code, String name) {
            this.code = code;//le das valor, que es code
            this.name = name;
        }

        @Override
        public int compareTo(Pokemon o) { 
            if (this.code > o.code) return 1;
            else if (this.code < o.code) return -1;
            else return 0;//el mismo pokemon, o el mismo 
        }

    }


    private RegistroPokemon<String,String> registroPokemonStrings;
    private RegistroPokemon<Integer,Integer> registroPokemonCodigos;
    private RegistroPokemon<String,Pokemon> registroPokemonObjetos;

    @Before
    public void setup() {
        this.registroPokemonStrings = new RegistroPokemon<>();
        this.registroPokemonCodigos = new RegistroPokemon<>();
        this.registroPokemonObjetos = new RegistroPokemon<>();
    }

    @Test
    public void registroExists() {
        assertNotNull(this.registroPokemonStrings);
        assertNotNull(this.registroPokemonCodigos);
        assertNotNull(this.registroPokemonObjetos);
    }

    @Test
    public void pokemonStringOnPokedexExists() {
        this.registroPokemonStrings.addPokemonToPokedex("Magikarp");
        assertTrue(this.registroPokemonStrings.getPokedex().contains("Magikarp"));
    }

    @Test
    public void pokemonIntOnPokedexExists() {
        this.registroPokemonCodigos.addPokemonToPokedex(1);
        assertTrue(this.registroPokemonCodigos.getPokedex().contains(1));
    }

    @Test
    public void entrenadorStringExists() {
        this.registroPokemonStrings.addPokemonToPokedex("Squirtle");
        this.registroPokemonStrings.addPokemonToPokedex("Charmander");
        this.registroPokemonStrings.addPokemonToPokedex("Bulbasaur");

        List<String> pokemons = new ArrayList<>();
        pokemons.add("Squirtle");
        pokemons.add("Charmander");
        pokemons.add("Bulbasaur");

        this.registroPokemonStrings.addEntrenador("Txema", pokemons);
        assertTrue(this.registroPokemonStrings.getEntrenadores().containsKey("Txema"));
    }

    @Test
    public void entrenadorStringFailBadPokemon() {
        List<String> pokemons = new ArrayList<>();
        pokemons.add("Missigno");
        this.registroPokemonStrings.addEntrenador("Rocio", pokemons);
        assertFalse(this.registroPokemonStrings.getEntrenadores().containsKey("Rocio"));
    }

    @Test
    public void pokemonObjectOnPokedexExists() {
        Pokemon myPok = new Pokemon(150, "Mewtwo");
        this.registroPokemonObjetos.addPokemonToPokedex(myPok);
        assertTrue(this.registroPokemonObjetos.getPokedex().contains(myPok));
    }

    @Test
    public void entrenadorObjetoExists() {
        Pokemon myPok1 = new Pokemon(1, "Bulbasaur");
        Pokemon myPok2 = new Pokemon(4, "Squirtle");
        Pokemon myPok3 = new Pokemon(7, "Charmander");
        Pokemon myPok4 = new Pokemon(25, "Pikachu");

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(myPok2);//los pokemon que tut tienes
        pokemons.add(myPok4);

        this.registroPokemonObjetos.addPokemonToPokedex(myPok1);//añado pokemon a la pokedex
        this.registroPokemonObjetos.addPokemonToPokedex(myPok2);
        this.registroPokemonObjetos.addPokemonToPokedex(myPok3);
        this.registroPokemonObjetos.addPokemonToPokedex(myPok4);
        this.registroPokemonObjetos.addEntrenador("Txema", pokemons);
        assertTrue(this.registroPokemonObjetos.getEntrenadores().containsKey("Txema"));//compruebo si el entredao tieen los pokemon 
    }

    @Test
    public void entrenadorObjectFailBadPokemon() {
        Pokemon myPok2 = new Pokemon(4, "Squirtle");
        Pokemon myPok4 = new Pokemon(25, "Pikachu");

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(myPok2);
        pokemons.add(myPok4);

        this.registroPokemonObjetos.addEntrenador("Txema", pokemons);
        assertFalse(this.registroPokemonObjetos.getEntrenadores().containsKey("Txema"));
    }
}
