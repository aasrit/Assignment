public class UnsupportedException {
    public void display(int first, int second)  {
        try {
            int res = first / second;
            System.out.println(res);
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        UnsupportedException ue = new UnsupportedException();
        ue.display(25, 0);

        System.out.println("This is the program that relates to arithmetic exception");
    }
}
