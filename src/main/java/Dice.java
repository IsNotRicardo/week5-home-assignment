import java.util.Random;

public class Dice {
    private static final int DIE_FACES = 6;

    private int die1;
    private int die2;

    public Dice() {
        roll();
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        Random random = new Random();

        die1 = random.nextInt(DIE_FACES) + 1;
        die2 = random.nextInt(DIE_FACES) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }
}
