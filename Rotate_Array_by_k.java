package Array;

import java.util.Scanner;

public class Rotate_Array_by_k {
    //Not solved..
    static int[] RotateArrayByK(int[] nums){
        int n = nums.length;
        int temp = nums[n-1];
        for (int i = 0; i < nums.length; i++) {
            if (i == n-1){
                continue;
            }
            nums[i+1] = nums[i];
        }
        nums[0] = temp;
        return nums;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(RotateArrayByK(nums));
    }
}
