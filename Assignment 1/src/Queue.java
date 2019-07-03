
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author Bruce Williams (972648)
 *
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {

	private QueueElement<T> head;
	private QueueElement<T> tail;

	/**
	 * Constructs an empty Queue.
	 */
	public Queue() {
		LinkedList<T> queue = new LinkedList<T>();
	}

	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty() {
		if (head == null && tail == null) {
			return true;
		}

		return false;
	}

	/**
	 * Returns the element at the head of the queue
	 */
	public T peek() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException("Element does not exist!");

		}

		return head.getElement();
	}

	/**
	 * Removes the front element of the queue
	 */
	public void dequeue() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Element does not exist!");

		}
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
	}

	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue(T element) {
		QueueElement<T> node = new QueueElement<T>(element, null);
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;

	}

	/**
	 * Method to print the full contents of the queue in order from head to
	 * tail.
	 */
	public void print() {
		if (head == null && tail == null) {
			System.out.println("The queue is empty");
		} else {
			QueueElement<T> printElement = head;
			while (printElement != tail.getNext()) { //Prints each element to the screen until all elements have been printed
				System.out.println(printElement.getElement() + ", ");
				printElement = printElement.getNext();
			}
		}

	}
}
