package lessons.collections.maps.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3Runner {
    public static void main(String[] args) {
        String str = "bbbcaacaw";
        System.out.println(getCharsCount(str));


    }

    public static Map<Character, Integer> getCharsCount(String s){
        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : arr){
            if(map.containsKey(ch)){
                int duplicateChar = map.get(ch);
                map.put(ch, ++duplicateChar);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
