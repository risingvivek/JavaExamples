package com.vk.quasys;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
        
        List<String> firstNames = Arrays.asList(names1);
        List<String> secondNames = Arrays.asList(names2);
        Set<String> finalSet = new TreeSet<>();
        try {
            
            finalSet.addAll(firstNames);
            finalSet.addAll(secondNames);
   
        } catch(Exception e) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
        return (String[]) finalSet.stream().toArray(n -> new String[n]);
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", Test.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}