package Handson;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter=new Greeter();
        Greeting helloWorldGreeting= new HelloWorldGreeting();
        greeter.greet((Greeting) helloWorldGreeting);
        Greeting myLambdaFunction=() -> System.out.println("Hello World");
       // MyAdd addfunction=(int a,int b) -> a+b;
    }
}
interface MyLambda {
    void foo();
}
/*interface MyAdd {
    int add(int x,int y);
} */
