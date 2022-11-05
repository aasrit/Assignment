public class SingleToneClass {
    private static SingleToneClass singletone=new SingleToneClass();
    private SingleToneClass() {

    }
    public static SingleToneClass getInstance() {
        return singletone;
    }
    protected static void demoMethod() {
        System.out.println("Demo method for singletone class");
    }
}
