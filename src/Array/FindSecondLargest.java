package Array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] arr = new int[]{2,5,7,10,23,21};
        int largest = Integer.MIN_VALUE;
        int secondLargest = arr[0];

        for(int i:arr) {
            if (i > largest)
                largest = i;
            if (i > secondLargest && i < largest)
                secondLargest = i;
        }
        System.out.println("second largest "+secondLargest);
    }
}
