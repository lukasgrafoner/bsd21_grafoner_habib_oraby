package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class TestDoubleQueue {
    private DoubleQueue doubleq;

    /**
     * Creates a setup, which is needed for the tests.
     * Create test-data
     */
    @BeforeEach
    public void setup() {
        doubleq = new DoubleQueue(5);
    }

    /**
     * Adding simpleDrink 5 times - returns true
     * Adding a 6th simpleDrink - returns false (max = 5)
     */
    @Test
    void testOffer(){
        Assertions.assertEquals(true, doubleq.offer(1.0));
        Assertions.assertEquals(true, doubleq.offer(2.0));
        Assertions.assertEquals(true, doubleq.offer(simpleDrink));
        Assertions.assertEquals(true, doubleq.offer(simpleDrink));
        Assertions.assertEquals(true, doubleq.offer(simpleDrink));
        Assertions.assertEquals(false, doubleq.offer(simpleDrink));
    }

    /**
     * Adding simpleDrink to the queue
     * Removing it with poll
     */
    @Test
    void testPoll(){
        doubleq.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, doubleq.poll());
    }

    /**
     * Adding simpleDrink to the queue
     * returning it because it's the first element
     */
    @Test
    void testPeek() {
        doubleq.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, doubleq.peek());
    }

    /**
     * Adding simpleDrink to the queue
     * Removing it with remove
     */
    @Test
    void testRemove() {
        doubleq.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, doubleq.remove());
    }

    /**
     * Test if exception will be thrown
     * Getting element from an empty queue
     */
    @Test
    void testElement() {
        Assertions.assertThrows(NoSuchElementException.class, () -> { doubleq.element();});
    }

}
