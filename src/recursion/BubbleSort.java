package recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[]arr = new int[]{15,4,5,2,3,11,1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,0,1,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr, int i, int j, int threshold) {
        if(threshold < 0)
            return;

        if(arr[i] > arr[j])
            Swap(arr,i,j);

        if(j == arr.length-1)
            bubbleSort(arr,0,1,--threshold);
        else
            bubbleSort(arr,i+1,j+1,threshold);

    }

    public static void Swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
