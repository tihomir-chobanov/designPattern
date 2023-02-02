package singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
/*
In this example, the Singleton class has a private constructor to ensure that instances of the class can only be created within the class.
The getInstance method returns the single instance of the class, creating a new instance if one doesn't already exist.
This ensures that there is only one instance of the Singleton class in the entire Java application.
 */