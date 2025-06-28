package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOperations {
	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(15);
		System.out.println(nums);
//		for(Integer num: nums) {
//			System.out.println(num);
//		}
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(15);
		System.out.println(ts);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(15);
		System.out.println(lhs);
		
	}
}
