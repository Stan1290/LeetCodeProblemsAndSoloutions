package com.LeetCodeProblems.LongestSubStringWithoutRepeatingNumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.border.StrokeBorder;

public class Solution {

	public static void main(String[] args) {

		String s = "qwnfenpglqdq";
		getLongestSubString(s);
	}

	public static int getLongestSubString(String s) {
		int[] chars = new int[256];
		Arrays.fill(chars, -1);
		int maxLen = 0;
		int subSeqStart = 0;
		for (int i = 0; i < s.length(); i++) {
			char curChar = s.charAt(i);
			int prevIdx = chars[curChar];
			if (prevIdx < subSeqStart) {
				chars[s.charAt(i)] = i;
			} else {
				chars[curChar] = i;
				subSeqStart = prevIdx + 1;
			}
			maxLen = i - subSeqStart + 1 > maxLen ? i - subSeqStart + 1 : maxLen;
		}
		return maxLen;
	}
}
