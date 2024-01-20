package Array;

import java.util.Scanner;

public class Second_largest_Second_Smallest_Array {
//    public static int[] getSecondOrderElements(int n, int[] a) {

        //Better approach
        // Create an array to hold the second largest and second smallest elements
//        int[] result = new int[2];
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            // Find the largest and second largest elements
//            if (a[i] > largest) {
//                secondLargest = largest;
//                largest = a[i];
//            } else if (a[i] > secondLargest && a[i] != largest) {
//                secondLargest = a[i];
//            }
//
//            // Find the smallest and second smallest elements
//            if (a[i] < smallest) {
//                secondSmallest = smallest;
//                smallest = a[i];
//            } else if (a[i] < secondSmallest && a[i] != smallest) {
//                secondSmallest = a[i];
//            }
//        }
//
//        // Assign the results to the array
//        result[0] = secondLargest;
//        result[1] = secondSmallest;
//
//        return result;
//    }
    //Optimized Approach..
            public static int[] getSecondOrderElements(int n, int []a) {
                // Write your code here.
                int[] result = new int[2];

                int largest = Integer.MIN_VALUE;
                int secondLargest = Integer.MIN_VALUE;
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;

                for (int i = 0; i < n; i++) {
                    // Find the largest and second largest elements
                    if (a[i] > largest) {
                        secondLargest = largest;
                        largest = a[i];
                    } else if (a[i] < largest && a[i] > secondLargest) {
                        secondLargest = a[i];
                    }

                    // Find the smallest and second smallest elements
                    if (a[i] < smallest) {
                        secondSmallest = smallest;
                        smallest = a[i];
                    } else if (a[i] < secondSmallest && a[i] != smallest) {
                        secondSmallest = a[i];
                    }
                }

                // Assign the results to the array
                result[0] = secondLargest;
                result[1] = secondSmallest;

                return result;
            }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[6];
        int n = a.length;

        // Collect input values for the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Get the second smallest and second largest elements
        int[] result = getSecondOrderElements(n, a);

        // Display the results
        System.out.println("Second Largest Element: " + result[0]);
        System.out.println("Second Smallest Element: " + result[1]);
    }



}
