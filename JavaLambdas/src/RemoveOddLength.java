import java.lang.*;
import java.util.*;
public class RemoveOddLength{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Aasritha");
        list.add("Mandapaka");
        list.add("Preethi");
        list.add("Anu");
        System.out.println(list);
        /*4*/list.removeIf(p ->p.length()%2!=0);
        /*6*/list.replaceAll(p ->p.toUpperCase(Locale.ROOT));
        System.out.println(list);
    }
}