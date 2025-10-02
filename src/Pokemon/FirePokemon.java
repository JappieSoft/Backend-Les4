package Pokemon;

public class FirePokemon extends Pokemon {

    private String fireType;
    private int fireHeat;

    public FirePokemon(String name, int healthPoints, String fireType, int fireHeat) {
        super(name, healthPoints);
        this.fireType = fireType;
        this.fireHeat = fireHeat;
    }

    public String getFireType() {
        return fireType;
    }

    public int getFireHeat() {
        return fireHeat;
    }

    public void setFireType(String newFireType) {
        this.fireType = newFireType;
    }

    public void setFireHeat(int newFireHeat) {
        this.fireHeat = newFireHeat;
    }

  /*  @Override
    public void sayName(FirePokemon firePokemon) {
        System.out.println("This FirePokemon goes by the name of: " + firePokemon.getName());
    }
*/
    public void sayFireType(FirePokemon firePokemon) {
        System.out.println("Hi, my type of fire is: " + firePokemon.getFireType());
    }

    public void sayFireHeat(FirePokemon firePokemon) {
        System.out.println("I have " + firePokemon.getFireHeat() + " degrees of fire.");
    }

}
