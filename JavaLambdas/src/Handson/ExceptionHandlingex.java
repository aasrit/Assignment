package Handson;

public class ExceptionHandlingex {
    public static void main(String[] args) {
        int [] someNumbers={1,2,3,4};
        int key=2;
        process(someNumbers,key);
    }
    private static void process(int [] someNumbers,int key) {
      for(int i:someNumbers)  {
          System.out.println(i+key);
      }
    }
}
