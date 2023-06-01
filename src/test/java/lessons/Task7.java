package lessons;

/*
Написать метод, принимающий на вход координаты двух точек и возвращающий длину отрезка между этими точками.

При тестировании координаты вводить с клавиатуры.

 Подсказка: использовать класс Math и формулу расчета отрезка по координатам двух точек.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println(getDistance(x1, y1, x2, y2));


    }

    public static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
