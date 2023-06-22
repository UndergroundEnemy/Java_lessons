package lessons.oop.generics.task2;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return getName();
    }
}
