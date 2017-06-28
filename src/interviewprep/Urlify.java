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
public class Urlify {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        char[] c = str.toCharArray();
        char[] in = {'%', '2', '0'};
        ip.close();
        char temp = ' ';
        
        for(int i=0; i<c.length; i++)
        {
            if(c[i] == ' ')
            {
                c[i] = in[0];
            }
            int count = 1;
            for(int j=i+1; j<str.length()-1; i++)
            {
                if(count<=2)
                {
                    temp = c[j];
                    c[j] = in[1];
                    count++;
                }
                
            }
        
    }
    }
}
