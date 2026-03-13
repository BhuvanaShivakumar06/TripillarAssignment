package Assignment3.Module7;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){ //No of iterations(n-1)
            for (int j =0; j<n-i; j++){ //Second Last Element
                if(arr[j] > arr[j+1]){
                    //Swap arr[j] & arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,2,1,4,5,6,3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
