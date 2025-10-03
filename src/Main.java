import Pokemon.*;

public class Main {

    public static void main(String[] args) {

        FirePokemon charizard = new FirePokemon("Charizard", 78, "blizzard", 1200);
        FirePokemon pansear = new FirePokemon("Pansear ", 50, "tiny sparks", 250);
        WaterPokemon wartortle = new WaterPokemon("Wartortle", 40, 350, true);
        WaterPokemon magikarp = new WaterPokemon("Magikarp", 30, 2, false);
        GrassPokemon ivysaur = new GrassPokemon("Ivysaur", 80, "Powder", true, 8);
        GrassPokemon capsakid = new GrassPokemon("Capsakid", 60, "Spicy Peppers", false, 0);
        ElectricPokemon yamper = new ElectricPokemon("Yamper", 70, false, 0, 0);
        ElectricPokemon emolga = new ElectricPokemon("Emolga", 70, true, 30, 2);

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

        ivysaur.sayName();
        ivysaur.sayPoisonEffect();

        capsakid.sayName();
        capsakid.sayPoisonType();
        capsakid.seeFirePokemon();

        yamper.sayName();
        yamper.sayBatteryLevel();
        emolga.sayName();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();
        emolga.sayBatteryLevel();
        emolga.attackOpponent();

    }
}
