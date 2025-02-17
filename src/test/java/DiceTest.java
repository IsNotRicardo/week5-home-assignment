import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    private static final int DIE_FACES = 6;
    private static final int NUMBER_OF_ROLLS = 10;

    Dice dice = new Dice();

    @Test
    void testGetDie1() {
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= DIE_FACES);
    }

    @Test
    void testGetDie2() {
        dice.roll();
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= DIE_FACES);
    }

    @Test
    void testRollDice() {
        for (int i = 0; i < NUMBER_OF_ROLLS; i++) {
            dice.roll();
            assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= DIE_FACES);
            assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= DIE_FACES);
        }
    }

    @Test
    void testIsDouble() {
        for (int i = 0; i < NUMBER_OF_ROLLS; i++) {
            dice.roll();
            assertEquals(dice.getDie1() == dice.getDie2(), dice.isDouble());
        }
    }
}
