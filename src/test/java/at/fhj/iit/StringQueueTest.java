package at.fhj.iit;

import org.junit.*;
import java.util.NoSuchElementException;

/**
 * Test of String queue
 * Methods and variables are tested via JUnit tests.
 */

public class StringQueueTest {
    private StringQueue testQueue;

    /**
     * Builds a String queue with five elements
     */
    @Before
    public void setup()
    {
        testQueue = new StringQueue(5);
    }

    /**
     * Check if queue works according to FIFO principle
     */
    @Test
    public void testStoreOrder() {
        testQueue.offer("Test1");
        testQueue.offer("Test2");
        testQueue.offer("Test3");

        Assert.assertEquals("Test1", testQueue.remove());
        Assert.assertEquals("Test2", testQueue.remove());
        Assert.assertEquals("Test3", testQueue.remove());
    }

    /**
     * Tests if it is possible to add the maximum of elements and true returned.
     */
    @Test
    public void testOfferReturnValues() {
        testQueue.offer("T1");
        testQueue.offer("Testung2");
        testQueue.offer("Elemenetesgjhaldkjhf ehsdnfvksa3");
        testQueue.offer("4");

        Assert.assertTrue(testQueue.offer("Final5"));
    }

    /**
     * Tests whether false ist returned when offering more elements than allowed by maxSize
     */

    @Test
    public void testOfferOverflow() {
        testQueue.offer("Ich");
        testQueue.offer("habe");
        testQueue.offer("hier");
        testQueue.offer("viel");
        testQueue.offer("Spaß");

        Assert.assertFalse(testQueue.offer("."));
    }

    /**
     * Tests if two elements that are peeked after each other are the same
     */
    @Test
    public void doublePeek() {
        testQueue.offer("Element1");

        Assert.assertEquals(testQueue.peek(), testQueue.peek(), "Element1");
    }

    /**
     * Tests if peek on empty queue gets null as result
     */
    @Test
    public void testPeekUnderflow() {
        String test = testQueue.peek();

        Assert.assertTrue(test == null);

    }

    /**
     * Add an element to queue, call element() 2x and check if both return values are equal
     */
    @Test
    public void testDoubleElement() {
        testQueue.offer("Teststring");
        Assert.assertTrue(testQueue.element().equals(testQueue.element()));
    }

    /**
     * Try to retrieve an element from empty queue using element method
     */
    @Test (expected = NoSuchElementException.class)
    public void testElementUnderflow() {
        testQueue.element();
    }

    /**
     * Try to retrieve an element from empty queue using poll method
     */
    @Test
    public void testPollUnderflow() {
        Assert.assertNull(testQueue.poll());
    }

    /**
     * Try to retrieve an element from empty queue using remove method
     * @throws Exception
     */
    @Test (expected = NoSuchElementException.class)
    public void testRemoveUnderflow() throws Exception {
        testQueue.remove();
    }
}
