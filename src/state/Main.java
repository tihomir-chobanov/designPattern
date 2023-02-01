package state;

public class Main {
    public static void main(String[] args) {
        Handler handler = new Handler(new Car());
        handler.handle();
        handler.setVehicle(new Bycicle());
        handler.handle();
    }
}
