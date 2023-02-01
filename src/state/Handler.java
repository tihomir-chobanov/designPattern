package state;

public class Handler {
    private Vehicle vehicle;

    // constructor
    public Handler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // getter and setter
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // magic is here!
    public void handle() {
        vehicle.reverse();
    }

}
