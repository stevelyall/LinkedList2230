public class LinkedListTester {

    public static void main(String[] args) {

        LinkedOrderedList<Integer> list = new LinkedOrderedList<Integer>();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add(3);
        list.add(5);
        System.out.println(list.toString());

        System.out.println(list.isEmpty());
        System.out.println(list.size());

       list.add(7);
//        System.out.println(list.toString());
//
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
    }
}