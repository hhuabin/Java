package leetcode.Algorithm;

/**
 * 最长公共前缀
 * @author bin
 * @date 2023-07-04-9:30
 */
public class LongestCommonPrefix14 {

    public static void main(String[] args) {
        LongestCommonPrefix14 longest = new LongestCommonPrefix14();
        String[] strs = {"flower","flower","flower","flower"};
        System.out.println(longest.longestCommonPrefix(strs));
        System.out.println(longest.longestCommonPrefix2(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1) return "";
        if(strs.length == 1) return strs[0];
        boolean flag = false;
        Integer end = 0;
        int a = Math.min(5, 6);
        for (Integer i = 0; i < strs[0].length(); i++) {
            for (Integer j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    end = i;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        if(!flag) return strs[0];
        return strs[0].substring(0, end);
    }

    public String longestCommonPrefix2(String[] strs) {
        if(strs.length < 1) return "";

        return longestCommonPrefix(strs, 0, strs.length-1);
    }

    public String longestCommonPrefix(String[] strs, int start, int end) {
        if(start == end) return strs[start];
        else {
            int mid = (end - start) / 2 + start;
            String lcpLeft = longestCommonPrefix(strs, start, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, end);
            return samePrefix(lcpLeft, lcpRight);
        }
    }

    public String samePrefix(String str1, String str2) {

        Integer minLength = Math.min(str1.length(), str2.length());
        for (Integer i=0; i<minLength; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, minLength);
    }
}
