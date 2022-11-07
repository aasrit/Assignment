import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Lambdathird {
    public static void main(String[] args) {
        Supplier<Integer> s=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };
        Consumer<Integer> c=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
        Function<Integer,String> f=new Function() {
            @Override
            public Object apply(Object o) {
                return 0 ;
            }
        };
        s.get();
        c.accept(11);
        p.test(10);
        f.apply(6);
    }
}
