import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

public class ConversionArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("Quick");
        list.add("brown");
        list.add("fox");
        list.add("jumps");
        list.add("over");
        list.add("the");
        list.add("lazy");
        list.add("dog");
        System.out.println(list);
        String[] arr=list.toArray(String[] ::new);
        System.out.println(Arrays.toString(arr));
    }
}
