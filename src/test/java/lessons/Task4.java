package lessons;

/*
1. Написать метод getLastDigit(int number), который принимает на вход число, а возвращает последнюю цифру этого числа.

2. В методе main получить число, введенное с клавиатуры, затем вызвать метод getLastDigit, передав ему это число. Вывести на экран результат выполнения метода.

Подсказка:

Прочитать число, введенное с клавиатуры:

Scanner sc= new Scanner(System.in);

int number = sc.nextInt();
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(getLastDigit(a));

    }

    public static int getLastDigit(int number) {
        return number % 10;
    }
}
