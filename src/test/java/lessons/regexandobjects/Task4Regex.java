package lessons.regexandobjects;

import lombok.Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4Regex {
    public static void main(String[] args) {
        Client client = new Client("my_email@gmail.com", "127.0.0.0",
                "     Рос!!сия обл. Воронеж!ская р-н Коминт!ерновск!ий д. Воронеж ул.   Бакунина д. 41",
                "https://www.labirint.ru/books/594619/");

        System.out.println(ClientValidator.validateEmail(client.getEmail()));
        System.out.println(ClientValidator.validateIp(client.getIp()));
        System.out.println(ClientValidator.validateAddress(client.getAddress()));
        System.out.println(ClientValidator.validateUrl(client.getUrl()));

    }
}
@Data
class Client {
    private String email;
    private String ip;
    private String address;
    private String url;

    public Client(String email, String ip, String address, String url) {
        this.email = email;
        this.ip = ip;
        this.address = address;
        this.url = url;
    }
}

class ClientValidator {
    static final Pattern patternEmail = Pattern.compile("\\S+@[A-Za-z]{2,6}.(ru|com|net|org)");
    static final Pattern patternIp = Pattern.compile("(\\d{1,3}).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})");
    static final Pattern patternAddress = Pattern.compile("\\s*[А-Яа-я]+ обл. [А-Яа-я]+ р-н [А-Яа-я]+ " +
            "(г.|д.) [А-Яа-я]+ ул. [А-Яа-я]+ д. \\d+");
    static final Pattern patternUrl = Pattern.compile("http://|https://\\S+(/\\S+)*");


    public static boolean validateEmail(String email){
        return patternEmail.matcher(email).find();
    }

    public static boolean validateIp(String ip){
        return patternIp.matcher(ip).find();
    }

    public static boolean validateAddress(String address){
        String s = address.trim().replaceAll(" {2,}", " ").replaceAll("([^А-Яа-я/. 1-9\\-])", "");
//        String removeSpaces = s.replaceAll(" {2,}", " ");
//        String removeSpecialChars = removeSpaces.replaceAll("([^А-Яа-я/. 1-9\\-])", "");
        Matcher matcher = patternAddress.matcher(s);
        return matcher.find();
    }

    public static boolean validateUrl(String url){
        return patternUrl.matcher(url).find();
    }
}

