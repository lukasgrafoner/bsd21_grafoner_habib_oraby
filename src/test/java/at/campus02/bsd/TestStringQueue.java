package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;



public class TestStringQueue {
    private StringQueue stringq;

    /**
     * Creates a setup, which is needed for the tests.
     * Create test-data
     */
    @BeforeEach
    public void setup() {
        stringq = new StringQueue(5);
    }

    /**
     * Adding Strings 5 times - returns true
     * Adding a 6th String - returns false (max = 5)
     */
    @Test
    void testOffer(){
        Assertions.assertEquals(true, stringq.offer("one"));
        Assertions.assertEquals(true, stringq.offer("two"));
        Assertions.assertEquals(true, stringq.offer("three"));
        Assertions.assertEquals(true, stringq.offer("four"));
        Assertions.assertEquals(true, stringq.offer("five"));
        Assertions.assertEquals(false, stringq.offer("too much"));
    }

    /**
     * Adding String to the queue
     * Removing it with poll
     */
    @Test
    void testPoll(){
        stringq.offer("test");
        Assertions.assertEquals("test", stringq.poll());
    }

    /**
     * Adding String to the queue
     * returning it because it's the first element
     */
    @Test
    void testPeek() {
        stringq.offer("test");
        Assertions.assertEquals("test", stringq.peek());
    }

    /**
     * Adding String to the queue
     * Removing it with remove
     */
    @Test
    void testRemove() {
        stringq.offer("test");
        Assertions.assertEquals("test", stringq.remove());
    }

    /**
     * Test if exception will be thrown
     * Removing element from an empty queue
     */

    @Test
    public void testRemove2(){
        Assertions.assertThrows(NoSuchElementException.class, () -> stringq.remove());
    }


    /**
     * Test if exception will be thrown
     * Getting element from an empty queue
     */
    @Test
    void testElement() {
        Assertions.assertThrows(NoSuchElementException.class, () -> { stringq.element();});
    }

    /**
     * Test if testString will be given back
     */

    @Test
    void testElementFound(){
        String testString = "test";
        stringq.offer(testString);
        Assertions.assertEquals(testString,stringq.element());
    }

    /**
     * Test if "eins" will be given back
     */

    @Test
    void testElements(){
        stringq.offer("eins");
        stringq.offer("zwei");
        stringq.offer("drei");
        stringq.offer("vier");
        stringq.offer("fünf");
        Assertions.assertEquals("eins",stringq.element());
    }

}
