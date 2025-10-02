package Pokemon;

public class Pokemon {

        private String name;
        private int healthPoints;

        public Pokemon(String name, int healthPoints) {
            this.name = name;
            this.healthPoints = healthPoints;
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

        public void setType(int newHealthPoints) {
            this.healthPoints = newHealthPoints;
        }

        public void sayName(Pokemon pokemon) {
            System.out.println("Hi, my name is: " + pokemon.getName());
        }

        public void sayHealthPoints(Pokemon pokemon) {
            System.out.println("I have " + pokemon.getHealthPoints() + " hp.");
        }


}
