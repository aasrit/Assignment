import java.util.LinkedList;
import java.util.Iterator;
class DOB {
    int year;
    int month;
    int date;
    DOB(int year,int month,int date) {
        this.year=year;
        this.month=month;
        this.date=date;
    }
    public String toString() {
        return "DOB{"+ "year="+year +", month=" +month + ",date=" +date +"}";
    }
}

public class LinkedlistAssgn4 {
    public static void main(String[] args) {
       DOB b1=new DOB(2001,12,05);
        DOB b2=new DOB(2005,1,15);
        DOB b3=new DOB(1996,6,23);
        DOB b4=new DOB(2000,11,25);
        DOB b5=new DOB(2001,8,25);
        LinkedList<DOB> l1=new LinkedList<>();
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
        l1.add(b4);
        l1.add(b5);
        System.out.println(l1);
        Iterator<DOB> itr=l1.iterator();
        {
            while(itr.hasNext()) {
                int i=itr.next().year;
                if(i%4==0) {
                    System.out.println("Your date of birth is "+i+" is a leap year");
                }
                else {
                    System.out.println("Your date of birth is "+i+" not a leap year");
                }
            }
        }
    }
}
