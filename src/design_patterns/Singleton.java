package design_patterns;

public class Singleton {
    private static Singleton INSTANCE;
    final int a;
    private Singleton(int val) {
        this.a = val;
        System.out.println("Value has been initialised");
    }
    public static Singleton createInstance(int input) {
        if (INSTANCE == null) {
            synchronized(Singleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton(input);
            }
        }
        return INSTANCE;
    }
}
