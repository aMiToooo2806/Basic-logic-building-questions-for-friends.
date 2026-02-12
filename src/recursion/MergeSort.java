package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = new int[]{2,4,1,20,11,8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int s, int e) {
        if(s == e)
            return;
        int mid = s + (e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        mergeArray(arr,s,mid,e);
    }
    private static void mergeArray(int[] arr, int s, int mid, int e)
    {
        int[]temp = new int[e-s+1];
       int i = s;
       int j = mid+1;
       int k = 0;

       while(i <= mid && j <= e)
       {
           if(arr[i] <= arr[j])
               temp[k++] = arr[i++];
           else
               temp[k++] = arr[j++];
       }
       while(i <= mid)
           temp[k++] = arr[i++];
       while(j <= e)
           temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[s + x] = temp[x];
        }

    }

}
