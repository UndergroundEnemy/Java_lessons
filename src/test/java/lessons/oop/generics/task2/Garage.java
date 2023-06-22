package lessons.oop.generics.task2;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public T getVehicle(){
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
