package Pokemon;

public class FirePokemon extends Pokemon {

    private String fireType;
    private int fireHeat;

    public FirePokemon(String name, int healthPoints, String fireType, int fireHeat) {
        super(name, healthPoints, "fire");
        this.fireType = fireType;
        this.fireHeat = fireHeat;
    }

    public void sayFireType() {
        System.out.println("Hi, my type of fire is: " + getFireType());
    }

    public void sayFireHeat() {
        System.out.println("I have " + getFireHeat() + " degrees of fire.");
    }

    @Override
    public void sayName() {
        System.out.println("This FirePokemon goes by the name of: " + getName());
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

    @Override
    public String toString() {
        return "FirePokemon{" +
                "name= " + getName() +
                " fireType='" + fireType + '\'' +
                ", fireHeat=" + fireHeat +
                '}';
    }
}
