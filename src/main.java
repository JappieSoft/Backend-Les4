import Pokemon.Pokemon;
import Pokemon.FirePokemon;

public class main {



    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Henk", 100);
        pokemon.sayName(pokemon);
        pokemon.sayHealthPoints(pokemon);

        pokemon.setName("hippo");
        pokemon.sayName(pokemon);


        FirePokemon charizard = new FirePokemon("charizard", 78, "blizzard" , 1200);
        FirePokemon pansear = new FirePokemon("pansear ", 50, "tiny sparks" , 250);

        charizard.sayName(charizard);
        charizard.sayFireType(charizard);
        charizard.sayFireHeat(charizard);

        pokemon.sayName(pansear);
        pokemon.sayHealthPoints(pansear);


    }


}
