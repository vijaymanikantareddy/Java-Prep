package com;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 1, 3, 4, 2, 4, 2));
		System.out.println(nums);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(Integer num: nums) {
			if(!res.contains(num)) {
				res.add(num);
			}
		}
		System.out.println(res);
	}
}
