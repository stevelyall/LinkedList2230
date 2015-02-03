import exceptions.*;

/**
 * LinkedUnorderedList.java
 *
 * COMP 2230 Assignment 3 Question 3
 * Steven Lyall (T00023594)
 *
 * LinkedUnorderedList represents a singly linked implementation of an
 * unordered list.
 *
 * @author Java Foundations except where noted
 * @version 4.0
 */
public class LinkedUnorderedList<T> extends LinkedList<T>
         implements UnorderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedUnorderedList()
    {
        super();
    }

    /**
     * Adds the specified element to the front of this list.
     *  Complexity: O(1)
     *  Precondition: The LinkedUnorderedList object has been instantiated.
     *  Postcondition: An element has been added to the list.
     * @author stevelyall
     * @param element the element to be added to the list
	 */
    public void addToFront(T element)
    {
        LinearNode<T> toAdd = new LinearNode<T>(element);
        toAdd.setNext(head);
        head = toAdd;

        if (isEmpty()) {
            tail = head;
        }

        count++;
        modCount++;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *  Complexity: O(1)
     *  Precondition: The LinkedUnorderedList object has been instantiated.
     *  Postcondition: An element has been added to the list.
     * @param element the element to be added to the list
	 */
    public void addToRear(T element)
    {
        LinearNode<T> toAdd = new LinearNode<T>(element);

        if (!isEmpty()) {
            tail.setNext(toAdd);
            tail = toAdd;
        }
        else {
            head = tail = toAdd;
        }

        count++;
        modCount++;
    }
	
	
    /**
     * Adds the specified element to this list after the given target.
     *   Complexity: O(n)
     *   Precondition: The list has at least one element.
     *   Postcondition: The list has one more element.
     * @author stevelyall
     * @param  element the element to be added to this list
	 * @param  target the target element to be added after
	 * @throws ElementNotFoundException if the target is not found
	 */
    public void addAfter(T element, T target)
    {
        LinearNode<T> toAdd = new LinearNode<T>(element);

        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current != null && !found) {
            if (target.equals(current.getElement()))
                found = true;
            else {
                previous = current;
                current = current.getNext();
            }
        }

        if (!found) {
            throw new ElementNotFoundException("LinkedList");
        }
        // only one element in the list
        if (size() == 1) {
            head.setNext(toAdd);
            tail = toAdd;
        }
        // target is at the head
        else if (current.equals(head)) {
            toAdd.setNext(head.getNext());
            head.setNext(toAdd);
        }
        // target is at the tail
        else if (current.equals(tail)) {
            tail.setNext(toAdd);
            tail = toAdd;
        }
        // target is in the middle
        else {
            toAdd.setNext(current.getNext());
            current.setNext(toAdd);
        }
        count++;
        modCount++;
    }	
}
