package test.regex;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s = "         Росс!ия обл.             Вороне#жская р-н              Комин$терновский д. Воро#!неж ул.              Бакунина д. 41 ";
        Pattern pattern = Pattern.compile("\\S(?!\\S)");
        Matcher matcher = pattern.matcher(s);
        //String removeSpaces = s.replaceAll(" {2,}", " ");
        //String removeSpecialChars = removeSpaces.replaceAll("([^А-Яа-я/. 1-9\\-])", "");
        System.out.println(s.trim());

//        while(matcher.find()){
//            System.out.println("Position: " + matcher.start() + " Symbol: " + matcher.group());
//        }
    }
}
