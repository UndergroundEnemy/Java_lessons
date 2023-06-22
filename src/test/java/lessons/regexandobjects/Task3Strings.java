package lessons.regexandobjects;

/*
Написать метод, принимающий на вход слово и возвращающий true если слово является палиндромом.

Палиндром - слово, которое при чтении в справа на лево не меняет значения.

Пример - "шалаш", если перевернуть слово, то ничего не измениться.
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Task3Strings {
    public static void main(String[] args) {
        String str = "шалаш";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String arg){
        StringBuilder str = new StringBuilder(arg);
        return arg.equals(str.reverse().toString());
    }
}
