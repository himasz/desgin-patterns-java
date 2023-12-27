package creational.singleton;

/*
* An implementation of the Singleton design pattern with double-check locking and lazy initialization.
* It ensures that a class has only one instance and provides a global point of access to that instance.
*
* */
public final class MySingletonClass {

    private static volatile MySingletonClass instance;
    private static final Object syncLock = new Object();

    private MySingletonClass() {
        // private constructor to prevent instantiation
    }

    // Double-check locking for lazy initialization
    public static MySingletonClass getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (syncLock) {
            if (instance == null) {
                instance = new MySingletonClass();
            }
        }
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
