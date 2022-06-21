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
     * Removing element (a double value) from an queue with 0.0 as element
     */
    @Test
    void testRemoveEmpty() {
        doubleq.offer(0.0);
        Assertions.assertThrows(NoSuchElementException.class, () -> { doubleq.remove();});
    }

    /**
     * Test if exception will be thrown
     * Getting element (a double value) from an empty queue
     */
    @Test
    void testElement() {
        Assertions.assertThrows(NoSuchElementException.class, () -> { doubleq.element();});
    }

    /**
     * Test if the only element will be returned
     * Getting element (a double value) from a queue
     */
    @Test
    void testElementFound(){
        doubleq.offer(1.0);
        Assertions.assertEquals(1.0, doubleq.element());
    }

    /**
     * Test if the top element will be returned
     */
    @Test
    void testElements(){
        doubleq.offer(1.0);
        doubleq.offer(2.0);
        doubleq.offer(63.0);
        Assertions.assertEquals(1.0, doubleq.element());
    }

}
