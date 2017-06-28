/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author v-akdesh
 */
public class StringsPermutation {
    public static void main(String[] args)
    {
        System.out.println("Enter the strings.");
        Scanner ip = new Scanner(System.in);
        String str1 = ip.nextLine();
        String str2 = ip.nextLine();
        ip.close();
        if(str1.length() != str2.length())
        {
            System.out.println("Strings are not permutation-like.");
        }
        else
        {
            Map<Character, Integer> dict1 = new HashMap();
            Map<Character, Integer> dict2 = new HashMap();
            for(int i=0; i<str1.length(); i++)
            {
                if(dict1.get(str1.charAt(i)) == null)
                {
                    dict1.put(str1.charAt(i), 1);
                }
                else
                {
                    dict1.put(str1.charAt(i), dict1.get(str1.charAt(i)) + 1);
                }
            }
            
            for(int j=0; j<str1.length(); j++)
            {
                if(dict2.get(str2.charAt(j)) == null)
                {
                    dict2.put(str2.charAt(j), 1);
                }
                else
                {
                    dict2.put(str2.charAt(j), dict2.get(str2.charAt(j)) + 1);
                }
            }
            
            if(dict1.equals(dict2))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            
            
        }
    }
}
