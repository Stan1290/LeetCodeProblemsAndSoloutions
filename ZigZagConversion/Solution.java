package com.LeetCodeProblems.ZigZagConversion;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 4));
	}

	public static String convert(String s, int numRows) {
		String result = "";
		ArrayList<String> rows = new ArrayList<>();
		int size = s.length();
		for (int i = 0; i < numRows; i++) {
			rows.add("");
		}
		boolean down = true;
		int position = 0;
		while (position < size) {
			position = populateDown(s, position, rows, numRows, down);
			position = populateUp(s, position, rows, numRows, down);
		}
		for (int i = 0; i < numRows; i++) {
			result += rows.get(i);
		}
		return result;
	}

	public static int populateDown(String s, int position, ArrayList<String> arr, int rows, boolean isDown) {
		int start = 0;
		int length = s.length();
		while (start < rows && position < length) {
			String str = arr.get(start);
			str += "" + s.charAt(position);
			arr.set(start, str);
			position++;
			start++;
		}
		isDown = false;
		return position;
	}

	public static int populateUp(String s, int position, ArrayList<String> arr, int rows, boolean isDown) {
		int start = rows - 2;
		int length = s.length();
		while(position < length && start > 0){
			String str = arr.get(start) + s.charAt(position);
			arr.set(start, str);
			start --;
			position++;
		}
		return position;
	}

}
