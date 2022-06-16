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
     * Create test-data
     */
    @BeforeEach
    public void setup() {
        drinkq = new DrinkQueue();
        liquid = new Liquid("Cola", 2, 0);
        simpleDrink = new SimpleDrink("CocaCola", liquid);

    }

    /**
     *  Check attributes of the liquid
     */
    @Test
    void testLiquid() {
        Assertions.assertEquals(0, liquid.getAlcoholPercent());
        Assertions.assertEquals("Cola", liquid.getName());
        Assertions.assertEquals(2, liquid.getVolume());
    }

    /**
     * Adding simpleDrink 5 times - returns true
     * Adding a 6th simpleDrink - returns false (max = 5)
     */
    @Test
    void testOffer(){
        Assertions.assertEquals(true, drinkq.offer(simpleDrink));
        Assertions.assertEquals(true, drinkq.offer(simpleDrink));
        Assertions.assertEquals(true, drinkq.offer(simpleDrink));
        Assertions.assertEquals(true, drinkq.offer(simpleDrink));
        Assertions.assertEquals(true, drinkq.offer(simpleDrink));
        Assertions.assertEquals(false, drinkq.offer(simpleDrink));
    }

}
