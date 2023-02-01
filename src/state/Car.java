package state;

public class Car implements Vehicle{
    @Override
    public void reverse() {
        System.out.println("Push the gear lever left and forward");
    }
}
