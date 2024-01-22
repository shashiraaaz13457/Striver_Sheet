package Array;

import java.util.Scanner;

public class Remove_duplicates_from_Array {
    static int RemoveDuplicates(int[] nums){
        int uniqueElement = 0 ;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                uniqueElement++;
//                nums[uniqueElement] = nums[i];
            }
        }return uniqueElement +1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter values: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int result = RemoveDuplicates(nums);
        System.out.println(result);
    }
}
