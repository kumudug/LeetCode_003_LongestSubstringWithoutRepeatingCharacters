package com.company;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for(int i = 0, j = 0; j < n; j++) {
            Character charAtJ = s.charAt(j);
            if(map.containsKey(charAtJ)) {
                i = Math.max(i, map.get(charAtJ) + 1);
            }
            longestLength = Math.max(longestLength, j - i + 1);
            map.put(charAtJ, j);
        }

        return longestLength;
    }
}
