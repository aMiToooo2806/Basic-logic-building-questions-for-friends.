package recursion;

import java.util.Arrays;

import static recursion.BubbleSort.Swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = new int[]{2,4,5,1,3,15,11};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,0, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr, int i, int threshold) {
        if(threshold == arr.length-1)
            return;

        int min = findMin(arr, i);
        Swap(arr,i,min);

        selectionSort(arr,i+1, ++threshold);
    }

    private static int findMin(int[] arr,int start) {
        int min = start;
        for (int i = start+1; i<arr.length; i++)
        {
            if(arr[i] < arr[min])
                min = i;
        }
        return min;
    }
}
