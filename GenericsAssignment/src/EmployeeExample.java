
import java.util.*;

public class EmployeeExample {

    public static void main(String args[]) {
        HashSet<Employee<Integer,String,Integer,String>> hashSet = new HashSet<>();
        Employee<Integer,String,Integer,String> e1 =  new Employee<>(401010,"Adam",20000,"Java full stack");
        Employee<Integer,String,Integer,String> e2 =  new Employee<>(401011,"Alley",30000,"Python");

        if(e1 instanceof Employee && e2 instanceof Employee) {
            hashSet.add(e1);
            hashSet.add(e2);
        }

        for(Employee<Integer,String,Integer,String> e: hashSet) {
            e.displayDetails();
        }

    }


}



