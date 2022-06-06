import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {


    public static void main(String[] args) {


        List<String> l = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("shdvgcd");
        linkedList.add("shdvgcd");
        linkedList.add("shdvgcd");
        linkedList.add("shdvgcd");
        linkedList.addFirst("hello");
        linkedList.add(3,"asasa");
        linkedList.addLast("bye");

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
       linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);





    }
}
