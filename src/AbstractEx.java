public abstract class AbstractEx {
        abstract void main();
    }
    class Reading extends AbstractEx
    {
        void main()
        {
            System.out.println(" Read the text");
        }
    }
    abstract class Write extends AbstractEx
    {
        abstract void main();
    }
    abstract class Detail
    {
        private int age;
    }
    class ConceptAbstract {
        public static void main(String args[]) {
            Reading s=new Reading();
            s.main();
        }
    }
