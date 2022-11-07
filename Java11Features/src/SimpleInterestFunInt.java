import Handson.LocalVarType;

public class SimpleInterestFunInt {
    public static void main(String[] args) {
        FuncInter Result=(var p,var t,var r) -> {
            System.out.println((p*t*r)/100);
            return (p*t*r)/100;
        };
        Result.interest(12000,2,10);
    }
    interface FuncInter {
        int interest(int a,int b,int c);
    }
}