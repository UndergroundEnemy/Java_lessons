package lessons.cycles;
/*
* Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
*
* */

public class Task2Cycles {
    public static void main(String[] args) {
        long a = 7893823445L;
        int result = 0;
        do{
            result += a%10;
            a = a/10;
            System.out.println(result);
        } while (a != 0);
//        System.out.println(result);
    }

}
