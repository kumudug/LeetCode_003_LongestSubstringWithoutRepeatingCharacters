package com.company;


import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        int curCount = 0;
        int curLoc = 0;
        HashMap<Character, Integer> uniqueStrings = new HashMap<>();
        char[] inputChars = s.toCharArray();

        while(curLoc < s.length()) {
            char currentChar = inputChars[curLoc];
            if(uniqueStrings.containsKey(currentChar)) {
                if(curCount > longestLength) {
                    longestLength = curCount;
                }
                curLoc = uniqueStrings.get(currentChar) + 1;
                curCount = 0;
                uniqueStrings.clear();
            } else {
                uniqueStrings.put(currentChar,curLoc);
                curCount++;
                curLoc++;
            }
        }

        return longestLength > curCount ? longestLength : curCount;
    }
}
