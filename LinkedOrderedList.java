import exceptions.*;

/**
 * LinkedOrderedList.java
 *
 * COMP 2230 Assignment 3 Question 2
 * Steven Lyall (T00023594)

 * LinkedOrderedList represents a singly linked implementation of an
 * ordered list.
 *
 * @author Java Foundations except where noted
 * @version 4.0
 */
public class LinkedOrderedList<T> extends LinkedList<T>
        implements OrderedListADT<T> {
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList() {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
     * the element's natural ordering. Throws a NonComparableElementException
     * if the element is not comparable.
     *  Complexity: O(n)
     *  Precondition: The LinkedOrderedList object has been instantiated.
     *  Postcondition: The list has an additional element.
     * @author stevelyall
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
     */
    public void add(T element) {
        LinearNode<T> toAdd = new LinearNode<T>(element);

        // noncomparable
        if (!(element instanceof Comparable)) {
            throw new NonComparableElementException(element.getClass().toString());
        }

        if (isEmpty()) {
            head = toAdd; // why does size become 1?
            tail = toAdd;
        }

        if (size() == 1) {
            // less than existing item, add before
            if (((Comparable) element).compareTo(head.getElement()) < 0) {
                System.out.println("add before " + ((Comparable) element).compareTo(head.getElement()));
                toAdd.setNext(tail);
                head = toAdd;
            } else { // greater than or equal to existing item, add after
                System.out.println("add after" + ((Comparable) element).compareTo(head.getElement()));
                head.setNext(toAdd);
                tail = toAdd;
            }
        }

        if (size() > 1) {
            LinearNode<T> previous = null;
            LinearNode<T> current = head;

            while (current != null && (((Comparable) toAdd.getElement()).compareTo(current.getElement()) > 0)) {
                previous = current;
                current = current.getNext();
            }
            // add to beginning
            if (current == head) {
                toAdd.setNext(head);
                head = toAdd;
            }
            // add to end
            if (previous == tail) {
                previous.setNext(toAdd);
                tail = toAdd;
            }
            else {
                toAdd.setNext(current);
                if (previous == null) {

                }
                else {
                    previous.setNext(toAdd);
                }
            }
        }

        count++;
        modCount++;
    }

}
