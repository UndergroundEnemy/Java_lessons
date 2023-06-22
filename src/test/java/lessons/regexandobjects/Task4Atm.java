package lessons.regexandobjects;
/*
Создать класс описывающий Банкомат.

Набор купюр, находящихся в банкомате, должен задаваться свойствами: количеством купюр номиналом 20, 50, 100.

Сделать методы для добавления денег в банкомат.

Сделать метод, снимающий деньги.

С клавиатуры передается сумма денег. На экран выводим операция удалась или нет.

При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма. Создать конструктор с тремя параметрами – количеством купюр разного наминала.
*/

public class Task4Atm {
    public static void main(String[] args) {

    }


}

class Atm{
    private int num20;
    private int num50;
    private int num100;
    private int allMoney;

    public int countMoney(){
        int a = num20*20;
        int b = num50*50;
        int c = num100*100;

        return a + b + c;
    }
    public void addMoney(int num20, int num50, int num100){
        this.num20+=num20;
        this.num50+=num50;
        this.num100+=num100;

    }

    public boolean withdrawMoney(int money){
        int balance = money;
        int amountNum100 = 0;
        int amountNum50 = 0;
        int amountNum20 = 0;
        boolean result = false;

        if (balance < allMoney) {
            amountNum100 = Math.min(balance/100, num100);
            balance -= amountNum100*100;
            if(balance != 60){
                amountNum50 = Math.min(balance/50, num50);
                balance -= amountNum50*50;
            }
            amountNum20 = Math.min(balance/20, num20);
            balance -= amountNum20*20;
            if(balance == 0){
                result = true;
            } else {
                System.out.println("Недостаточно купюр в банкомате");
            }
        } else {
            System.out.println("Недостаточно средств на счете");
        }

        return result;

    }
}
