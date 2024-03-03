package Array.Medium;
import java.util.Arrays;
import java.lang.reflect.Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        int target = 9;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
//    Input :- nums = [2,7,11,15] , target = 9;
//    Output :- [0,1]
    static int[] twoSum(int[] nums,int target){
        int n = nums.length;
        int sum = 0;
//        int[] arr = new int [2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//                sum = sum + nums[i];
                if (nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }return nums;
    }
}
