package com.LeetCodeProblems.LongetsPalindrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String s1 = "abassdsz";
		String s2 = "baaacaaab3ergdafffa";
		String s3 = "xabcddcbay";
		// boolean isPal1 = isPalindrome(string);
		// boolean isPal2 = isPalindrome(string2);
		// longestPalindrome(s3);
		System.out.println(longestPalindrome(s2));
		// System.out.println("isPal1: " + isPal1 + ", isPal2: " + isPal2);
	}

	public static String longestPalindrome(String s) {
		String longetsPanidrome = s.length() == 0 ? "" :"" + s.charAt(0);
		HashMap<Character, ArrayList<Integer>> positions = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (positions.containsKey(s.charAt(i))) {
				positions.get(s.charAt(i)).add(i);
			} else {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(i);
				positions.put(s.charAt(i), arr);
			}
		}
		for (Map.Entry<Character, ArrayList<Integer>> entry : positions.entrySet()) {
			ArrayList<Integer> indexes = entry.getValue();
			for (int j = 0; j < indexes.size(); j++) {
				int start = indexes.get(j);
				for (int t = j + 1; t < indexes.size(); t++) {
					int currentPositon = indexes.get(t);
					if ((currentPositon - start + 1) > longetsPanidrome.length()) {
						if (isPalindrome(s.substring(start, currentPositon + 1))) {
							longetsPanidrome = s.substring(start, currentPositon + 1);
						}
					}
				}
			}
		}

		return longetsPanidrome;
	}

	public static boolean isPalindrome(String s) {
		int range = s.length();
		boolean isOdd = range % 2 != 0;
		int index1, index2;
		if (isOdd) {
			index1 = range / 2 - 1;
			index2 = range / 2 + 1;
		} else {
			index1 = range / 2 - 1;
			index2 = range / 2;
		}
		while (index1 >= 0) {
			if (s.charAt(index1) != s.charAt(index2))
				return false;
			index1--;
			index2++;
		}
		return true;
	}

}
