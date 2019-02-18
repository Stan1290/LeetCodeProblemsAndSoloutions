package com.LeetCodeProblems.AddTwoNumberListNode;

import java.awt.List;
import java.math.BigInteger;
import java.util.function.Function;

public class Solution {
	
	

	public static void main(String[] args){
		ListNode test1 = new ListNode(2);
		test1.next = new ListNode(4);
		test1.next.next = new ListNode(3);
		ListNode test2 = new ListNode(5);
		test2.next = new ListNode(6);
		test2.next.next = new ListNode(4);
		
		ListNode test3 = new ListNode(9);
		ListNode test4 = new ListNode(5);
		
		Solution solution = new Solution();
		ListNode result = solution.getListNodeOfSum(test3, test4);
		System.out.println("   " );
	}
	
	public ListNode getListNodeOfSum(ListNode l1, ListNode l2) {
		ListNode l1Next = l1.next;
		ListNode l2Next = l2.next;
		int sumRes = l1.val + l2.val;
		int carry = sumRes / 10;
		ListNode lnResult = new ListNode(sumRes % 10);
		ListNode temp = lnResult;
		while (carry > 0 || l1Next != null || l2Next != null) {
			int l1Val = l1Next != null ? l1Next.val : 0;
			int l2Val = l2Next != null ? l2Next.val : 0;
			sumRes = l1Val + l2Val + carry;
			carry = sumRes / 10;
			temp.next = new ListNode(sumRes % 10);
			temp = temp.next;
			l1Next = l1Next == null ? null : l1Next.next;
			l2Next = l2Next == null ? null : l2Next.next;

		}
		return lnResult;
	}
	
}
