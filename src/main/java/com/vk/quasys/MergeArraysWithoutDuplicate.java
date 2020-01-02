package com.vk.quasys;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MergeArraysWithoutDuplicate {

	public static void main(String[] args) {
		
    List<String> firstList = Arrays.asList("aaa", "bbb", "ddd");
    firstList.stream().sorted((a,b) -> a.compareTo(b))
             .collect(Collectors.toList());
            
    List<String> secondList = Arrays.asList("ccc", "bbb","aaa", "eee", "fff");
    secondList.stream()
              .sorted((a, b) -> a.compareTo(b))
              .collect(Collectors.toList());
    
    Set<String> finalSet = new TreeSet<>();
    finalSet.addAll(firstList);
    finalSet.addAll(secondList);
    
    System.out.print(finalSet);
    
    
	}

}
