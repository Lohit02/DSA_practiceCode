package com.lohit;

import java.util.*;

public class Leetcode49 {


    public List<List<String>> groupAnagram(String[] inputArray){
        Map<String, List<String>> map= new HashMap<>();
        for( String str: inputArray)
        {
            char[] charArray= str.toCharArray();
            Arrays.sort(charArray);
            String sortedString= String.valueOf(charArray);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return  new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        Leetcode49 ga= new Leetcode49();
        String[] inputArray={"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagram(inputArray));
    }
}


