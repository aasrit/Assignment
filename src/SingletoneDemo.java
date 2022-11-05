public class SingletoneDemo {
    public static void main(String[] args) {
        SingleToneClass single=SingleToneClass.getInstance();
        single.demoMethod();
    }
}
