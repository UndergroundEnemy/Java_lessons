package lessons.regexandobjects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern pattern = Pattern.compile("\\S(?!\\S)");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            System.out.println("Position: " +  matcher.start() + " Char: " + matcher.group());
        }

        sc.close();
    }
}
