package lessons;
/*
Поделить пиццу.

1.Через System.in вводить:

- количество людей

- количество кусков в одной пицце

2. Вывести на экран минимальное количество пицц, чтобы у всех было одинаковое количество кусков и ни одного не осталось лишнего в коробке.
*/

import java.util.Scanner;

public class Task4Cycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int pizzaSlices = sc.nextInt();
        int pizzaNum = 1;

        // 7 кусков = 1 пицца и 5 человек; 14 кусков = 2 пиццы и 5 чел,
        // 6 кусков = 1 пицца и 4 чел, 12 кусков = 2 пиццы и 4 чел

        while (pizzaNum*pizzaSlices%people!=0){
            pizzaNum++;
        }
        System.out.println(pizzaNum);
    }
}
