package lessons.oop.generics.task2;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return getName();
    }

}
