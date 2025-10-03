package Pokemon;
import java.lang.Math;

public class WaterPokemon extends Pokemon{

    private int attackAmount;
    private boolean canBlowBubbles;

    public WaterPokemon(String name, int healthPoints, int attackAmount, boolean canBlowBubbles) {
        super(name, healthPoints, "Water");
        this.attackAmount = attackAmount;
        this.canBlowBubbles = canBlowBubbles;
    }

    public void sayAttackAmount() {
        System.out.println("Hi, my type of Water is: " + getAttackAmount());
    }

    public void blowingBubbles() {
        int i = (int) (Math.random() * 30);
        System.out.println(i);

        if(i <= 10){
            System.out.println("You missed! See you next time");
            return;}
        if (canBlowBubbles) {
            System.out.println("I have bubbles to show you!");
            System.out.println("You've been bubbled with " + getAttackAmount() + " bubbles!");
        } else {
        System.out.println("I cover you with my tears, as i can't blow bubbles!");
        System.out.println("So you end up with a slap from my tail!");
            setAttackAmount(attackAmount-1);
            if (attackAmount <= 0) {
                System.out.println("You get 5 extra slaps as final attack, sorry!");
                setAttackAmount(5);
            }
        }
    }

    @Override
    public void sayName() {
        System.out.println("This WaterPokemon goes by the name of: " + getName());
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public boolean getBlowBubbles() {
        return canBlowBubbles;
    }

    public void setAttackAmount(int newAttackAmount) {
        this.attackAmount = newAttackAmount;
    }

    public void setBlowBubbles(boolean canBlowBubbles) {
        this.canBlowBubbles = canBlowBubbles;
    }

}
