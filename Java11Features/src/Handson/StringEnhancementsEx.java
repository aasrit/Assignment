package Handson;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEnhancementsEx {
    public static void main(String[] args) {
       String a="Welcome ";
       //System.out.println(a);
       // a.lines().forEach(System.out::println);
        //System.out.println(a.isBlank());
        //List<String> res=a.lines().collect(Collectors.toList());
       // System.out.println(res);
        //System.out.println(a.strip());
        //System.out.println(a);
        //System.out.println(a.trim());
        System.out.println(a.repeat(10));

    }
}
