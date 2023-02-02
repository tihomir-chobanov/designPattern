package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2); // prints "true"
        instance1.showMessage();

        System.out.println("Hashcode of x is " + instance1.hashCode());
        System.out.println("Hashcode of y is " + instance2.hashCode());


        if (instance1 == instance2) {
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }


}