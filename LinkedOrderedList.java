import exceptions.*;

/**
 * LinkedList.java
 *
 * COMP 2230 Assignment 3 Question 1
 * Steven Lyall (T00023594)
 *
 * LinkedOrderedList represents a singly linked implementation of an
 * ordered list.
 *
 * @author Java Foundations except where noted
 * @version 4.0
 */
public class LinkedOrderedList<T> extends LinkedList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        LinearNode<T> toAdd = new LinearNode<T>(element);

        if ( !(element instanceof Comparable) ) {
            throw new NonComparableElementException(element.getClass().toString());
        }

        // empty list, add first
        if (isEmpty()) {
            head = toAdd;
            head.setNext(tail);
            tail = toAdd;
            count++;
            modCount++;
            return;
        }

        // list with one item, add second
        if (size()==1){
            // less than existing item, add before
            if (((Comparable) element).compareTo(head.getElement()) < 0) {
                System.out.println("add before " + ((Comparable) element).compareTo(head.getElement()));
                toAdd.setNext(tail);
                head = toAdd;
            } else { // greater than or equal to existing item, add after
                System.out.println("add after" + ((Comparable) element).compareTo(head.getElement()));
                tail = toAdd;
                head.setNext(toAdd);
            }
            return;
        }

        // TODO fix adding 3rd item
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;


        while (current != null && !found)
            // current is greater than or equal to element
            if (((Comparable) element).compareTo(current.getElement()) <= 0) {

                found = true;
            }
            else
            {
                previous = current;
                current = current.getNext();
            }

        previous.setNext(toAdd);

        // adding at tail
        if (current == null) {
            tail = previous.getNext();
        }

        count++;
        modCount++;
    }
}
