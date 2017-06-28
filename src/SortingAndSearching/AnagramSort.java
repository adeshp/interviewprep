/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author v-akdesh
 */
public class AnagramSort {
    public static void main(String[] args)
    {
       String[] arr = {"Akshay", "Ashkay", "Akki", "ABCD", "XYZ", "XY", "ikkA"};
       String[] arry = getAnagramSorted(arr);
       for(String s : arry)
       {
           System.out.println(s);
       }
    }
    
    public static String[] getAnagramSorted(String[] arr)
    {
        //Create a hashtable to store the sorted chars and strings.
        //then just create the string array and return it.
        Map<String, ArrayList<String>> dict = new HashMap<>();
        for(String s : arr)
        {
            char[] content = s.toCharArray();
            Arrays.sort(content);
            String key = new String(content);
            if(!dict.containsKey(key)){
                dict.put(key, new ArrayList<String>());
            }
            dict.get(key).add(s);
        }
        int index = 0;
        //Get the value set and create the array from it
        for(String key : dict.keySet())
        {
            ArrayList<String> values = dict.get(key);
            for(String s : values)
            {
                arr[index] = s;
                index++;
            }
        }
        
        return arr;
    }
}
