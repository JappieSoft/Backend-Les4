package Pokemon;

public abstract class Pokemon {

    private String name;
    private int healthPoints;
    private String type;

    public Pokemon(String name, int healthPoints, String type) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.type = type;
    }

    public abstract void sayName();

    public void sayHealthPoints(Pokemon pokemon) {
        System.out.println("I have " + pokemon.getHealthPoints() + " hp.");
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHealthPoints(int newHealthPoints) {
        this.healthPoints = newHealthPoints;
    }

}
