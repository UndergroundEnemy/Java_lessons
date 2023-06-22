package lessons.oop.generics.task2;

public class GarageRunner {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        carGarage.setVehicle(new Car("car"));
        motorcycleGarage.setVehicle(new Motorcycle("moto"));

        System.out.println(carGarage.getVehicle());
        System.out.println(motorcycleGarage.getVehicle());



    }
}
