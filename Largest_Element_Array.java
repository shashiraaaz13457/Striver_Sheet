package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Element_Array {
    static void largestElement(int[] arr, int n) {
        int larger = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>larger) larger = arr[i];
        }
        System.out.println(larger);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[5];
        int larger = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        largestElement(arr,n);


    }

}