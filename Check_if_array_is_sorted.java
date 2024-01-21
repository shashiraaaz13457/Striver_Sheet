package Array;

import java.util.Scanner;

public class Check_if_array_is_sorted {
    static boolean isSorted(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        boolean result = isSorted(nums);
        System.out.println(result);
    }
}
