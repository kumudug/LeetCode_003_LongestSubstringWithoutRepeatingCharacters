package com.company;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int i = 0, j = 0;

        while(i < n && j < n) {
            Character charAtJ = s.charAt(j);
            if(set.contains(charAtJ)) {
                set.remove(s.charAt(i++));
            } else {
                set.add(charAtJ);
                j++;
                longestLength = Math.max(longestLength, j - i);
            }
        }

        return longestLength;
    }
}
