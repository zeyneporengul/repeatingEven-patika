package org.example;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 2, 2, 2, 4, 6, 6, 12, 12, 5};
        int[] duplicate = new int[arr.length];
        int index = 0;

        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if((i!=j) && (arr[i] == arr[j])){
                    if((arr[i]%2 == 0) && (!isFind(duplicate, arr[i]))){
                        duplicate[index++] = arr[i];
                        System.out.println((arr[i]));
                        break;
                    }
                }
            }
        }

    }
}