package com.vk.quasys;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergingNames {

	public static void main(String[] args) {
		
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(uniqueNames(names1, names2)); // should print Ava, Emma,

	}
	
	public static String uniqueNames(String[] names1, String[] names2) {

		try {

			List<String> first = Arrays.asList(names1);
			List<String> second = Arrays.asList(names2);
			Set<String> finalSet = new TreeSet<String>();
			finalSet.addAll(first);
			finalSet.addAll(second);
			System.out.println(finalSet);
			return finalSet.toString();
		} catch (Exception e) {
			throw new UnsupportedOperationException("Waiting to be implemented." + e);
		}

}
	
}
