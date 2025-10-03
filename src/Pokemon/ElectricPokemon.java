package Pokemon;

public class ElectricPokemon extends Pokemon {
    private boolean attackElectric;
    private int shockStrength;
    private int batteryLevel;

    public ElectricPokemon(String name, int healthPoints, boolean attackElectric, int shockStrength, int batteryLevel) {
        super(name, healthPoints, "fire");
        this.attackElectric = attackElectric;
        this.shockStrength = shockStrength;
        this.batteryLevel = batteryLevel;
    }

    public void attackOpponent() {
        int i = (int) (Math.random() * 10);
        if (batteryLevel > 0) {
            System.out.println("I zapped you and you wished it was a socket at home!");
            System.out.println("Your hp has been reduced by " + getShockStrength() + "!");
            setBatteryLevel(batteryLevel - 1);
        } else {
            System.out.println("I tackle you instead because my battery is empty!");
            System.out.println("I know, this isn't great and i await your attack. \nI'm scared, please be nice!");
            setBatteryLevel(i);
        }
    }

    public void sayBatteryLevel() {
        System.out.println("I have " + batteryLevel + " ready for use!");
    }

    public void sayAttackType() {
        if (attackElectric) {
            System.out.println("I'm can't shock anyone, i know! It's shocking!");
        } else {
            System.out.println("Let's go! And shock someone!");
        }
    }

    @Override
    public void sayName() {
        System.out.println("My name is: " + getName() + " and i'm electrifying!");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getShockStrength() {
        return shockStrength;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        this.batteryLevel = newBatteryLevel;
    }

    public void setShockStrength(int newShockStrength) {
        this.shockStrength = newShockStrength;
    }
}
