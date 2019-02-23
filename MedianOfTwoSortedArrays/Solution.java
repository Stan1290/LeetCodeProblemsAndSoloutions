package com.LeetCodeProblems.MedianOfTwoSortedArrays;

public class Solution {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] arr =  combineArrays(nums1, nums2);
		return findMedian(arr);
	}
	
	public static int[] combineArrays(int arr1[], int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		int index1 = 0, index2 = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (index1 < arr1.length && index2 < arr2.length) {
				if (arr1[index1] == arr2[index2]) {
					newArr[i] = arr1[index1];
					newArr[i + 1] = arr1[index1];
					index1++;
					index2++;
					i++;
				} else if (arr1[index1] < arr2[index2]) {
					newArr[i] = arr1[index1];
					index1++;
				} else {
					newArr[i] = arr2[index2];
					index2++;
				}

			} else if (index1 < arr1.length) {
				newArr[i] = arr1[index1];
				index1++;
			} else if (index2 < arr2.length) {
				newArr[i] = arr2[index2];
				index2++;
			}
		}

		return newArr;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int[] nums1 = { 1, 2 };
		int[] nums3 = {3};
		int[] nums2 = { -2, -1 };
		int[] nums4 = { 1, 3, 4, 6, 8 };
		int[] nums5 = {2, 4, 5, 7};
		int[] a = combineArrays(nums1, nums2);
		System.out.println("aaaaa");

	}

	private static double findMedian(int[] arr) {
		if (arr.length == 0)
			return 0;
		if (arr.length % 2 == 0) {
			return (((double)arr[(arr.length - 1) / 2] + (double)arr[arr.length / 2]) / 2);
		} else {
			return arr[arr.length / 2];
		}

	}

}
