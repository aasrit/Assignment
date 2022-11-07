import java.util.Date;
public class PairEx {
    public static void main(String[] args) {
            PairEx myobj1 = new PairEx();
            myobj1.setKey("1");
            myobj1.setValue("Hello");

            System.out.println("Key: "+myobj1.getKey()+", Value:"+myobj1.getValue());

            PairEx myobj2 = new PairEx();
            myobj2.setKey("Today is");
            myobj2.setValue(String.valueOf(new Date()));

            System.out.println("Key: "+myobj2.getKey()+", Value:"+myobj2.getValue().toString());
        }

    private Object getValue() {
        return null;
    }

    private String getKey() {
        return null;
    }

    private void setValue(String hello) {
    }

    private void setKey(String s) {
    }

}
