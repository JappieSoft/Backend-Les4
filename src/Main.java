import Pokemon.*;

public class Main {

    public static void main(String[] args) {

        FirePokemon charizard = new FirePokemon("Charizard", 78, "blizzard" , 1200);
        FirePokemon pansear = new FirePokemon("Pansear ", 50, "tiny sparks" , 250);
        WaterPokemon wartortle = new WaterPokemon("Wartortle", 40, 350, true);
        WaterPokemon magikarp = new WaterPokemon("Magikarp", 30, 2, false);

        charizard.sayName();
        charizard.sayFireType();
        charizard.sayFireHeat();

        pansear.sayName();
        pansear.sayHealthPoints(pansear);

        wartortle.blowingBubbles();
        wartortle.blowingBubbles();
        wartortle.blowingBubbles();
        magikarp.blowingBubbles();
        magikarp.blowingBubbles();
        magikarp.blowingBubbles();
        magikarp.blowingBubbles();
        magikarp.blowingBubbles();
        magikarp.blowingBubbles();

        System.out.println(magikarp);
        System.out.println(charizard);

    }


}
