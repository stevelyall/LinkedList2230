/**
 * LinkedListTester.java
 *
 * COMP 2230 Assignment 3
 * Steven Lyall (T00023594)
 *
 * Tests LinkedOrderedList and LinkedUnorderedList.
 *
 * @author stevelyall
 */

public class LinkedListTester {

    public static void main(String[] args) {

        // -------------------
        // test ordered list
        // -------------------
        System.out.println("** TESTING ORDERED LIST **");
        LinkedOrderedList<Integer> ordered = new LinkedOrderedList<Integer>();

        System.out.println("Is empty true? " + ordered.isEmpty());
        System.out.println("Is size 0? " + ordered.size());

        System.out.println("Adding 1...");
        ordered.add(1);

        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Adding 2...");
        ordered.add(2);

        System.out.println("Is empty false? " + ordered.isEmpty());
        System.out.println("Is size 2? " + ordered.size());

        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Adding 3...");
        ordered.add(5);

        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Adding 4...");
        ordered.add(4);

        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Adding 3...");
        ordered.add(3);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Removing 4...");
        ordered.remove(4);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Removing last element...");
        ordered.removeLast();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();

        System.out.println("Removing the first element...");
        ordered.removeLast();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(ordered);
        System.out.println();



        // -------------------
        // test unordered list
        // -------------------
        System.out.println("** TESTING UNORDERED LIST **");
        LinkedUnorderedList<Integer> list = new LinkedUnorderedList<Integer>();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding 1 to the list...");
        list.addToFront(1);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding 2 to the front of the list...");
        list.addToFront(2);

        System.out.println("Is empty false? " + list.isEmpty());
        System.out.println("Is size 2? " + list.size());

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding 3 to the rear of the list...");
        list.addToRear(3);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Removing the first item...");
        list.removeFirst();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Removing the last item...");
        list.removeLast();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Removing the last item...");
        list.removeLast();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding 1 to the front of the list...");
        list.addToFront(1);
        System.out.println("Adding 2 to the front of the list...");
        list.addToFront(2);
        System.out.println("Adding 3 to the front of the list...");
        list.addToFront(3);
        System.out.println("Adding 4 to the front of the list...");
        list.addToFront(4);
        System.out.println("Adding 5 to the front of the list...");
        list.addToFront(5);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding a 9 after the 5...(beginning)");
        list.addAfter(9, 5);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding an 8 after the 1...(end)");
        list.addAfter(8,1);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Adding a 6 after the 3...(middle-ish)");
        list.addAfter(6,3);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Remove 6...");
        list.remove(6);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Remove 3...");
        list.remove(3);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Remove 5...(beginning)");
        list.remove(5);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Remove 8...(end)");
        list.remove(8);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Removing more elements...");
        list.removeFirst();
        list.removeLast();
        list.removeFirst();

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

        System.out.println("Removing last element, 2...");
        list.remove(2);

        System.out.println();
        System.out.println("Printing the list...");
        System.out.println(list);
        System.out.println();

    }
}