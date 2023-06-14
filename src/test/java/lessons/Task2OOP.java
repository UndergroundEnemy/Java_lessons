package lessons;
/*
* Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).

○  Создать несколько объектов-цветов со свойствами:

    - стоимость

    - дата поступления

    - срок годности с даты поступления

    - цвет

     Все поля сделайте private  и напишите для всех полей getter и setter методы

○  Собрать букет и определить его стоимость. (Напишите метод для сбора букета)

○  Определить все цвета, используемые в букете.

*** Определить, когда весь букет завянет (Не обязательное)
* */

import lombok.Data;

import java.time.LocalDate;
import java.util.Arrays;


public class Task2OOP {
    public static void main(String[] args) {
        Flower[] buket = {new Rose(20, LocalDate.now(), LocalDate.of(2023, 9, 15), "Red"),
                new Lily(26, LocalDate.now(), LocalDate.of(2023, 8, 25), "Blue"),};

        System.out.println(defFlowersPrice(buket));
        System.out.println(Arrays.toString(defFlowersColor(buket)));
        System.out.println(defExpDate(buket));
    }

    public static int defFlowersPrice(Flower... fl){
        int buketPrice = 0;
        for(int i = 0; i <= fl.length - 1; i++){
            buketPrice += fl[i].getPrice();
        }

        return buketPrice;
    }

    public static String[] defFlowersColor(Flower... fl){
        String[] buketColors = new String[fl.length];
        for(int i = 0; i <= fl.length - 1; i++){
            buketColors[i] = fl[i].getColor();
        }

        return buketColors;
    }

    public static LocalDate defExpDate(Flower... fl){
        LocalDate latestExpDate = null;
        if(fl!=null && fl.length>1){
            latestExpDate = fl[0].getExpireDate();
        } else {
            return null;
        }
        for(int i = 1; i <= fl.length - 1; i++){
            if(fl[i].getExpireDate().isAfter(latestExpDate)){
                latestExpDate = fl[i].getExpireDate();
            }
        }

        return latestExpDate;
    }


}
@Data
abstract class Flower{
    private int price;
    private LocalDate comingDate;
    private LocalDate expireDate;
    private String color;

    public Flower(int price, LocalDate comingDate, LocalDate expireDate, String color) {
        this.price = price;
        this.comingDate = comingDate;
        this.expireDate = expireDate;
        this.color = color;
    }
}

class Rose extends Flower{

    public Rose(int price, LocalDate comingDate, LocalDate expireDate, String color) {
        super(price, comingDate, expireDate, color);
    }
}


class Lily extends Flower{

    public Lily(int price, LocalDate comingDate, LocalDate expireDate, String color) {
        super(price, comingDate, expireDate, color);
    }
}
