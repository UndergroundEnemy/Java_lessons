package lessons.oop.generics.task3;

import java.util.ArrayList;

public class TestRunner {
    public static void main(String[] args) {
        GenClass<Integer> genClass1 = new GenClass<>(2, 30, 43, 109, 1000);
        System.out.println(genClass1.getValue(4));
    }
}
