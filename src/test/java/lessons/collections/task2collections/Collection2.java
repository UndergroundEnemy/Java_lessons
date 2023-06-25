package lessons.collections.task2collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;

public class Collection2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        final int min = 0;
        final int max = 100;

        for(int i = min; i<max; i++){
            arrayList.add(getRandomNumber(min, max));
        }

        arrayList = (ArrayList<Integer>) arrayList.stream()
                .distinct()
                .collect(Collectors.toList());

        for(int i: arrayList){
            System.out.println(i);
        }

        System.out.println("\nList size: " + arrayList.size());
    }

    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
