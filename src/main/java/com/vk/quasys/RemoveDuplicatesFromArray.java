package com.vk.quasys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.assertj.core.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		Integer[] arrayWithDuplicates = new Integer[] {1, 2, 23, 4, 5, 2, 16};
		
		List<Object> listVal = Arrays.asList(arrayWithDuplicates);
		
		Set<Object> setVal = new HashSet<Object>(listVal);
		SortedSet<Object> sset = new TreeSet<Object>(listVal);
		
		List<Object> finalList = new ArrayList<Object>(sset);
		
		System.out.println(finalList);

	}

}
