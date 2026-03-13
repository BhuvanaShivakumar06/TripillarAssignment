package Assignment3.Module6;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println("Array Before:" + Arrays.toString(arr));
        System.out.print("After Reversing The array:");
        for (int i =arr.length-1; i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
