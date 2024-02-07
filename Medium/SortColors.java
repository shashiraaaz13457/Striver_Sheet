package Array.Medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

//    Brute-force Approach
    static int[] sortColors(int[] nums) {
            // int initial = nums[0];.
            int temp = 0;
            for(int i = 0; i<nums.length-1;i++){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        // initial = nums[i];
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        // nums[i] = nums[j];
                    }
                }

            }return nums;
        }
}

