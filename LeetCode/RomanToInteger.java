// Solution for leet Code problem
// Question -- https://leetcode.com/problems/roman-to-integer/
class Solution {
    
    public int romanToInt(String s) {
      HashMap<Character, Integer> cnst = new LinkedHashMap<Character, Integer>();
        cnst.put('I', 1);
        cnst.put('V', 5);
        cnst.put('X', 10);
        cnst.put('L', 50);
        cnst.put('C', 100);
        cnst.put('D', 500);
        cnst.put('M', 1000);
        
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length) {
                if (cnst.get(chars[i]) >= cnst.get(chars[i + 1])) {
                    result = result + cnst.get(chars[i]);
                } else {
                    result = result + (cnst.get(chars[i + 1]) - cnst.get(chars[i]));
                    i++;
                }
            } else {
                result = result + cnst.get(chars[i]);
            }

        }
        return result;
    }
}
