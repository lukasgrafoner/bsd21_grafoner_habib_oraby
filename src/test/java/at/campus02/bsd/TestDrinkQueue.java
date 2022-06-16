package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDrinkQueue {
    private DrinkQueue drinkq;
    private Liquid liquid;
    private SimpleDrink simpleDrink;

    /**
     * Creates a setup, which is needed for the tests.
     * Create a valid liquid, simple-drink and drinks-queue object
     */
    @BeforeEach
    public void setup() {
        drinkq = new DrinkQueue();
        liquid = new Liquid("Cola", 2, 0);
        simpleDrink = new SimpleDrink("CocaCola", liquid);

    }

    /**
     *  All liquid get-methods are tested without any errors.
     */
    @Test
    void testLiquid() {
        Assertions.assertEquals(0, liquid.getAlcoholPercent());
        Assertions.assertEquals("Cola", liquid.getName());
        Assertions.assertEquals(2, liquid.getVolume());
    }
}
