package creational.singleton;

public final class MySimplerSingletonClass {

    private static final MySimplerSingletonClass instance = new MySimplerSingletonClass();

    private MySimplerSingletonClass() {
        // private constructor to prevent instantiation
    }

    public static MySimplerSingletonClass getInstance() {
        return instance;
    }

    private int someValue;

    public int getSomeValue() {
        return someValue;
    }

    public void setSomeValue(int someValue) {
        this.someValue = someValue;
    }
}
