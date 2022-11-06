import java.util.ArrayList;
import java.util.Scanner;
class Student {
    String name;
    int roll;
}
public class ArrayDemo {
    public static void main(String[]args) {

                ArrayList<String> list1=new ArrayList<String>();
                ArrayList list2=new ArrayList();
                Student s1=new Student();
                s1.name="Kavya";
                s1.roll=1;

                list1.add("Aasritha");
                list1.add("Preethi");
                list1.add("Anusha");
                list2.add(10);
                list2.add(20);
                list2.add(30);
                list2.add(s1);
                String name=list1.get(2);
                System.out.println("name is :"+name);
                System.out.println("list1 is :" +list1);
        System.out.println("list2 is :" +list2);
        Object o=list2.get(2);
        System.out.println("o is : "+o);
        list1.set(2,"Anu");
        System.out.println("list1 now is "+list1);
        list1.remove(1);
        System.out.println("list1 now is :"+list1);
        if(list1.contains("Aasritha")) {
            System.out.println("Aasritha  contains in the list");
        }

            }
        }