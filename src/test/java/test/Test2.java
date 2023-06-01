package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test2 {

    public static void main(String[] args) {

        int[] arr = new int[]{91, 89, 99};

        maxNumber(arr);

    }

    public static void maxNumber(int[] arr){
        int sum = 0;
        int index = 0;
        int maxNum = 0;
        for(int i=0; i<=arr.length-1; i++){
            for(int x = arr[i]; x>0; x/=10){
                sum+=x%10;
                if(maxNum<sum){
                    maxNum=sum;
                    index = i;
                }
            }
            sum = 0;
        }
        System.out.print(arr[index] + ", ");
        System.out.print(maxNum);
    }
}



