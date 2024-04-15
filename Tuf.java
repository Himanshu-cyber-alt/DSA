package Arrays;


import java.util.*;

public class Tuf {
    public static int[] getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return new int[]{right,left};
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 11;
        int[]len = getLongestSubarray(a, k);
    for(int x:len){
        System.out.println(x+" ");
    }
    }
}

