package Array;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
     }
     static int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int temp = 0;
        int count = 0;

         for (int i = 0; i < n; i++) {
             if (nums[i] == 1){
                 count++;
             }
             if (nums[i] == 0){
                 temp = Math.max(count,temp);
                 count = 0;
             }
         }return Math.max(count,temp);
     }
}
