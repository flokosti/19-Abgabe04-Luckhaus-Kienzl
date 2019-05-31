package at.fhj.iit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The queue is implemented as an array list, but has a defined max size.
 * The methods allow to add and remove elements from the queue (with or without deletion)
 * remove() and element() methods throw exceptions if the queue is empty. Some other methods return null in that case.
 */

public class StringQueue implements Queue {
	private static final Logger logger = LogManager.getLogger(StringQueue.class);

	private List<String> elements = new ArrayList<String>();
	private int maxSize;

	/**
	 * Construtor of a String queue
	 * @param maxSize defines the maximum number of elements
	 */
	public StringQueue(int maxSize){
		logger.info("Calling StringQueue constructor");
		this.maxSize = maxSize;
	}

	/**
	 * Adds the element obj to the queue.
	 * @param obj is added to the String queue
	 * @return true if addition is successful, else false
	 */
	public boolean offer(String obj) {
		logger.info("Calling method 'offer'.");

		if(elements.size()!= maxSize) {
			elements.add(obj);
			return true;
		} else {
			return false;
		}
	}

	/**
	 *  Returns the first element and also deletes it.
	 * 	@return first element or null if no element exists
	 */
	public String poll() {
		logger.info("Calling method 'poll'.");

		String element = peek();

		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * Returns and deletes the first element with NoSuchElementException
	 * If the queue is empty the method throws the exception.
	 * @return first element
	 */
	public String remove() {
		logger.info("Calling method 'remove'.");

		String element = poll();		

		if(element == null) {
			logger.error("...throwing NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		
		return element;
	}

	/**
	 * Returns the first element without deletion
	 * @return first element or null if the queue is empty.
	 */
	public String peek() {
		logger.info("Calling method 'peek'.");

		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 * Returns the first element without deletion, but with NoSuchElementException
	 * If the queue is empty the method throws the exception.
	 * @return first element
	 */
	public String element() {
		logger.info("Calling method 'element'.");

		String element = peek();
		if(element == null) {
			logger.error("...throwing NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		
		return element;
	}
}