package Array;

import java.util.Arrays;

public class Move_zero_to_end {
    public static void main(String[] args) {
//        Input -> [0,0,0,1]
//        Output -> [1,0,0,0]
//        int[] arr = {0,0,0,1};
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
