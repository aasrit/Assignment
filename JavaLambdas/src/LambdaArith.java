@FunctionalInterface
interface Arithmetic {
    int operations(int a,int b);
}
public class LambdaArith {
    public static void main(String[] args) {
        Arithmetic addition=(num1,num2) -> num1+num2;
        System.out.println("Addition ->" +addition.operations(7,9));
        Arithmetic subtraction=(num1,num2) -> num1-num2;
        System.out.println("Subtraction ->" +subtraction.operations(10,4));
        Arithmetic multiplication=(num1,num2) -> num1*num2;
        System.out.println("Multiplication ->" +multiplication.operations(6,4));
        Arithmetic divide=(num1,num2) -> num1/num2;
        System.out.println("Division ->" +divide.operations(10,4));




    }
        }