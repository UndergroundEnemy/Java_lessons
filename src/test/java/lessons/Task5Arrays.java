package lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize]; //initial array
        int[] arrMinFinal = new int[]{}; //array of max numbers

        //populating initial array
        for(int i=0; i<arrSize; i++){
            arr[i]=(int) (Math.random() * 100);
        }

        arrMinFinal = findMinNumbers(arr, arrSize);

        //initial array
        for(int y : arr){
            System.out.print(y + " ");
        }

        //final array
        System.out.println();
        for(int x : arrMinFinal){
            System.out.print(x + " ");
        }


    }

    public static int[] findMinNumbers(int[] arr, int arrSize){
        int count = 0;
        int[] arrMin = new int[arrSize];

        //finding min numbers
        for(int x=0; x<=arrSize-1; x++){
            if(x==0){
                if(arr[x]<arr[x+1]){
                    arrMin[count]=arr[x];
                    count++;
                }
            } else if(x==arrSize-1){
                if(arr[x]<arr[x-1]){
                    arrMin[count]=arr[x];
                    count++;
                }
            } else if(arr[x] < arr[x-1] || arr[x] < arr[x+1]){
                arrMin[count]=arr[x];
                count++;
            } else{
                continue;
            }
        }

        return Arrays.copyOf(arrMin, count);
    }
}
