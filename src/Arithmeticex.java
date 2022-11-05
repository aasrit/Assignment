public class Arithmeticex {
    public void display(int first, int second) {
        try {
            int res = first / second;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is undefined");
        }
    }

    public static void main(String[] args) {
        Arithmeticex ae = new Arithmeticex();
        ae.display(25, 0);

        System.out.println("This is the program that relates to arithmetic exception");
    }
}