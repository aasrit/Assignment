import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Test
    {

    }
    class CustomAnnotation {
        @Test
        public int testcase()
        {
            int a=1000;
            return a;
        }
        public static void main(String[] agrs)
        {
            CustomAnnotation  t = new CustomAnnotation ();
            System.out.println(t.testcase());
        }
    }
