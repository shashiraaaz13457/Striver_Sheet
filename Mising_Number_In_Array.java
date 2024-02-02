package Array;
import javax.lang.model.element.Element;
import java.util.Arrays;
import java.lang.reflect.Array;

public class Mising_Number_In_Array {
    public static void main(String[] args) {
        int[] nums = {9,7,6,5,0,1,3,2,4};
//        int[] nums = {3,0,1}
        int result = missingNumber(nums);

        System.out.println(result);
    }
    //Input: nums = [9,6,4,2,3,5,7,0,1]
    //    Output: 8

    static int missingNumber(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int Element = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == Element){
                Element++;
            }
        }return Element;
    }
}
