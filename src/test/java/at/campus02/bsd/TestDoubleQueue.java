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
     * Adding doubles 5 times - returns true
     * Adding a 6th double value - returns false (max = 5)
     */
    @Test
    void testOffer(){
        Assertions.assertEquals(true, doubleq.offer(1.0));
        Assertions.assertEquals(true, doubleq.offer(2.0));
        Assertions.assertEquals(true, doubleq.offer(3.0));
        Assertions.assertEquals(true, doubleq.offer(4.0));
        Assertions.assertEquals(true, doubleq.offer(5.0));
        Assertions.assertEquals(false, doubleq.offer(6.0));
    }

    /**
     * Adding a double value to the queue
     * Removing it with poll
     */
    @Test
    void testPoll(){
        doubleq.offer(1.0);
        Assertions.assertEquals(1.0, doubleq.poll());
    }

    /**
     * Adding a double value to the queue
     * returning it because it's the first element
     */
    @Test
    void testPeek() {
        doubleq.offer(1.0);
        Assertions.assertEquals(1.0, doubleq.peek());
    }

    /**
     * Adding a double value to the queue
     * Removing it with remove
     */
    @Test
    void testRemove() {
        doubleq.offer(1.0);
        Assertions.assertEquals(1.0, doubleq.remove());
    }

    /**
     * Test if exception will be thrown
     * Getting element (a double value) from an empty queue
     */
    @Test
    void testElement() {
        Assertions.assertThrows(NoSuchElementException.class, () -> { doubleq.element();});
    }

}
