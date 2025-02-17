public class Main {
    private static final int NUMBER_OF_ATTEMPTS = 10;

    public static void main(String[] args) {
        Dice dice = new Dice();

        int doubleCounter = 0;

        for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
            System.out.println("Rolling the dice...");
            dice.roll();
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());

            doubleCounter++;

            if (dice.isDouble()) {
                System.out.println("You rolled a double!");
                System.out.println("After " + doubleCounter + " tries both reach the same value");
                doubleCounter = 0;
            } else {
                System.out.println("Try again");
            }
        }
    }
}
