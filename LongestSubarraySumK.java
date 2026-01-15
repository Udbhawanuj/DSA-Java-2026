import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if(currSum == k) {
                maxLen = i + 1;
            }

            if(map.containsKey(currSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(currSum - k));
            }

            if(!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
