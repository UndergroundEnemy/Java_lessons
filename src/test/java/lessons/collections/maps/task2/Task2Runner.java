package lessons.collections.maps.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        String str = "red blue red grey yellow grey black red green purple purple";
        String[] text = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String s : text){
            if(map.containsKey(s)){
                int duplicateCount = map.get(s);
                map.put(s, ++duplicateCount);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);
    }
}
