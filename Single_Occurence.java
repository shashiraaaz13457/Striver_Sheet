package Array;

public class Single_Occurence {
    public static void main(String[] args) {
        int[] nums = {7,2,2,4,4};
        int ans = Single_Occurencee(nums);
        System.out.println(ans);
    }
    static int Single_Occurencee(int[] nums){
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
