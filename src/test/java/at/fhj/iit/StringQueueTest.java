package at.fhj.iit;
import org.junit.*;

/**
 * Test of String queue
 * Methods and variables are tested via JUnit tests.
 */

public class StringQueueTest {
    StringQueue testQueue;

    /**
     * Builds a String queue with five elements
     */
    @Before
    public void setup()
    {
        testQueue = new StringQueue(5);
    }

    /**
     *
     */
    @Test
    public void addElements() {

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

    @Test
    public void doubleElement() {

    }

    @Test
    public void elementOnEmptyQueue() {

    }

    @Test
    public void testPollUnderflow() {

    }

    @Test
    public void testRemoveUnderflow() {

    }


}
