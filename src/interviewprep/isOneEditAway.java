/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.Scanner;

/**
 *
 * @author v-akdesh
 */
public class isOneEditAway {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        String str1 = ip.nextLine();
        String str2 = ip.nextLine();
        Boolean result = isChecked(str1, str2);
        System.out.println(result);
        System.out.println(compressString(str1));
    }
    
    public static Boolean isChecked(String str1, String str2)
    {
        if(str1.length()-str2.length()>1 || str1.length()-str2.length()<-1)
        {
            return false;
        }
        int length = str1.length()>=str2.length() ? str1.length() : str2.length();
        int count =0;
        for(int i=0; i<length; i++)
        {
            if(i<str1.length() && i< str2.length())
            {
                if(str1.charAt(i) != str2.charAt(i))
                {
                    count++;
                }
            }
            else{
                count++;
            }
        }
        if(count > 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static String compressString(String str)
    {
        StringBuilder cmprs = new StringBuilder();
        int count =1;
        char temp = str.charAt(0);
        cmprs.append(temp);
        for(int i=1; i<str.length(); i++)
        {
            if(temp == str.charAt(i))
            {
                count++;
            }
            else
            {
               cmprs.append(count);
               temp = str.charAt(i);
               cmprs.append(str.charAt(i));
               count =1;
            }
        }
        cmprs.append(count);
        return cmprs.toString();
    }
}