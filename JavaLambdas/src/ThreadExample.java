import java.lang.*;
import java.util.*;
import java.util.function.Consumer;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            List<Integer> list = new ArrayList<Integer>();
            list.add(12);
            list.add(15);
            list.add(20);
            list.add(25);
            System.out.println(list);
            Consumer<List<Integer>> numList = list1 -> list.stream().forEach(a -> System.out.println(a + " "));
            modify.addThen(numList).accept(list);
        });
        t1.start();
    }
}
