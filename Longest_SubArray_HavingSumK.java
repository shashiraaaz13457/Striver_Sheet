package Array;

import java.util.Scanner;
//Input :- a = [1,2,3,1,1]
//Output :- 2
public class Longest_SubArray_HavingSumK {
    public static void main(String[] args) {
        int[] a = new int[5];
        long k = 5;
        Scanner input = new Scanner(System.in);
        //Taking Input
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int ans = getLongestSubarray(a,k);
        System.out.println(ans);
    }

    //Not for all testcases(In Some testcase it works)
    static int getLongestSubarray(int[] a, long k){
        int n = a.length;
        int length = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
                if (sum == k){
                    length = Math.max(length,j-i+1);
                    break;
                } else if (sum > k) {
                    break;
                }
            }
        }return length;
    }

//    static int getLongestSubarray(int[] a, long k){
//       int n = a.length;
//        int left = 0;
//        int right= 0;
//        long sum = a[0];
//        int maxlen = 0;
//
//        while (right < n){
//            while(left <= right && sum > k){
//                sum = sum - a[left];
//                left++;
//            }
//            if (sum == k){
//                maxlen = Math.max(maxlen, right-left+1);
//            }
//            right++;
//            if (right < n) sum += a[right];
//        }
//        return maxlen;
//    }
}
