package Pokemon;

public class GrassPokemon extends Pokemon {
    private String poisonType;
    private boolean poisonCausesSleep;
    private int sleepTime;

    public GrassPokemon(String name, int healthPoints, String poisonType, boolean poisonCausesSleep, int sleepTime) {
        super(name, healthPoints, "fire");
        this.poisonType = poisonType;
        this.poisonCausesSleep = poisonCausesSleep;
        this.sleepTime = sleepTime;
    }

    public void sayPoisonEffect() {
        if (poisonCausesSleep) {
            sayPoisonType();
            System.out.println("I will put you to sleep for " + getSleepTime() + " minutes!");
        } else {
            sayPoisonType();
        }
    }

    public void sayPoisonType() {
        System.out.println("I cover you with " + getPoisonType() + ", good luck!");
    }

    public void seeFirePokemon() {
        System.out.println("I see a fire pokemon, i'm scared and run away!");
    }

    @Override
    public void sayName() {
        System.out.println("This GrassPokemon comes out of the grass and shouts his name: " + getName());
    }

    public String getPoisonType() {
        return poisonType;
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setPoisonCausesSleep(boolean newSleeperPoison) {
        this.poisonCausesSleep = newSleeperPoison;
    }

    public void setSleepTime(int newSleepTime) {
        this.sleepTime = newSleepTime;
    }
}
