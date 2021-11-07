import java.util.*;

/**
 *
 */
public class LeetcodeSolution {


    /**
     * LeetCode #1 twoSums
     * @param nums
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newOne = nums[i];
            if (map.get(newOne) == null) {
                map.put(target - newOne, i);
            } else {
                return new int[]{i, map.get(newOne)};
            }
        }
        return null;
    }

    /**
     * 最长不重复子串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int max = 1;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i!=0) {
                set.remove(s.charAt(i-1));
            }
            while (left < s.length() && !set.contains(s.charAt(left))) {
                set.add(s.charAt(left));
                left++;
            }

            max = Math.max(max, left - i);
        }

        return max;
    }

    /**
     * 最长回文子串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        return null;
    }

    public String getNewString(String s) {
        return null;
    }

    public static void main(String[] args) {
        String ss = "ss";
        System.out.println(ss.split(""));
    }


}
