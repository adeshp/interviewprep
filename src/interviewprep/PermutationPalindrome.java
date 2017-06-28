/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author v-akdesh
 */
public class PermutationPalindrome {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Map<Character, Integer> dict = new HashMap<Character, Integer>();
        ip.close();
        for(int i=0; i<str.length(); i++)
        {
            if(dict.get(str.charAt(i)) == null)
            {
                dict.put(str.charAt(i),1);
            }
            else
            {
                dict.put(str.charAt(i), dict.get(str.charAt(i))+1);
            }
        }
       Iterator it = dict.entrySet().iterator();
//       while(it.hasNext())
//       {
//           Entry<Character, Integer> e = it.next();
//       }
        
    }
}
