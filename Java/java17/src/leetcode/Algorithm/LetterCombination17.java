package leetcode.Algorithm;

import java.util.*;

/**
 * 字母组合
 * @author bin
 * @date 2023-07-06-10:42
 */
public class LetterCombination17 {

    public static void main(String[] args) {
        LetterCombination17 letterCombination = new LetterCombination17();
        System.out.println(letterCombination.letterCombinations("2"));
    }

    HashMap<Character, String> hashMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        letterCombination(digits, 0, result, new StringBuffer());
//        result = letterCombination2(digits, 0);

        return result;
    }

    /**
     * 这个递归速度更快，因为是直接对结果赋值的
     * @param digits
     * @param index
     * @param result 结果数组
     * @param combination
     */
    public void letterCombination(String digits, int index, List<String> result, StringBuffer combination) {

        if(digits.length() < 1) return;
        if(index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        String string = hashMap.get(digits.charAt(index));

        for (int i=0; i<string.length(); i++) {
            combination.append(string.charAt(i));
            letterCombination(digits, index+1, result, combination);
            combination.deleteCharAt(index);
        }
    }

    public List<String> letterCombination2(String digits, int index) {

        List<String> list;
        List<String> resultList = new ArrayList<>();

        if(digits.length() < 1) return resultList;

        String str = hashMap.get(digits.charAt(index));

        if(index < digits.length() - 1) {
            list = letterCombination2(digits, index+1);

            for (int i=0; i<str.length(); i++) {

                for (int j=0; j<list.size(); j++) {
                    resultList.add(String.valueOf(str.charAt(i)) + list.get(j));
                }
            }

        } else if(index == digits.length()-1) {
            resultList = Arrays.asList(str.split(""));
            // resultList.forEach(System.out::println);
        }

        return resultList;
    }
}
