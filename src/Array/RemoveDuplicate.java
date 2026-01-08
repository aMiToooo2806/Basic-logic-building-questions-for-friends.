package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//for sorted array, or firstly sort the array
public class RemoveDuplicate {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
//        int j = 0;
//        for (int i = 0; i<arr.length-1; i++)
//        {
//            if(arr[i] != arr[i+1]){
//                arr[j]=arr[i];
//                j++;
//            }
//        }
//        arr[j]=arr[arr.length-1];
//        j++;
//        System.out.print("Unique elements: ");
//        for (int i = 0; i < j; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    //optimized apporach.
public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

     Set<Integer>set = new HashSet<>();
     for(int i:arr){
         set.add(i);
     }
    System.out.println(set);

   }
}
