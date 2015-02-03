public class LinkedListTester {

    public static void main(String[] args) {

        LinkedOrderedList<Integer> list = new LinkedOrderedList<Integer>();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add(5);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list);

        list.add(2);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list);

        list.add(1);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list);
    }
}