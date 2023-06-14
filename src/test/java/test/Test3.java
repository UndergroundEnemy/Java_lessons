package test;

import java.util.*;

public class Test3 {
    static final int b;

    static {
        b = 10;
        System.out.println(b);
    }
    public static void main(String[] args) {
        var collection = new HashSet<>();
        collection.add(1);
        var list1 = List.of(collection);
        collection.add(2);
        var list2 = List.copyOf(collection);
        System.out.println(list1);
        System.out.println(list2);





    }

    public static void sendMessage(int... nums){
        for(int i: nums){
            System.out.println(i);
        }
    }
}
