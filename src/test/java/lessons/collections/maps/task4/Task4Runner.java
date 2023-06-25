package lessons.collections.maps.task4;

import java.util.*;

public class Task4Runner {
    public static void main(String[] args) {
        final Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(11, "XI");
        map.put(12, "XII");
        map.put(13, "XIII");
        map.put(14, "XIV");
        map.put(15, "XV");
        map.put(16, "XVI");
        map.put(17, "XVII");
        map.put(18, "XVIII");
        map.put(19, "XIX");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> strList = new ArrayList<>();
        int counter = 1;

        for(int i = num; i>0; i/=10){
            int x = i%10;
            if(x>0 && num > 10){
                x = x*counter;
                strList.add(map.get(x));
            } else if(num < 10){
                System.out.println(map.get(num));
            }
            counter*=10;
        }

        System.out.println(strList);

        for(int j = strList.size()-1; j>=0; j--){
            System.out.print(strList.get(j));
        }

    }
}
