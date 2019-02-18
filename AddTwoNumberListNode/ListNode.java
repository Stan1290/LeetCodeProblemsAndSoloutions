package com.LeetCodeProblems.AddTwoNumberListNode;

public class ListNode {

	int val;
	ListNode next;

	public ListNode(int val) {
		super();
		this.val = val;
	}
	
	public boolean hasNext(){
		return next != null;
	}
	
	
}
