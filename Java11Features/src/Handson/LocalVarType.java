package Handson;

public class LocalVarType {
    public static void main(String[] args) {
        var x="JavaFullStack";
        var y=123456789;
     FuncInter funobj=(var a,var b) ->a+b;
    }
    interface FuncInter {
        int operation(int a,int b);
    }
}
