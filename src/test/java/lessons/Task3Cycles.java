package lessons;

public class Task3Cycles {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 50; i <= 70;i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                a++;
                if(a==2){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
