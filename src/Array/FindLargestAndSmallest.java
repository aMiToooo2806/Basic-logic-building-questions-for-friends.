package Array;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int [] arr = new int[]{2,5,7,10,23,21};

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
       for (int i:arr){
           if(i>largest)
               largest = i;
           if(i<smallest)
               smallest = i;
       }
        System.out.println("Smallest is "+smallest);
        System.out.println("Largest is "+largest);

    }
}
