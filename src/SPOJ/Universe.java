/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPOJ;

/**
 *
 * @author v-akdesh
 */
import java.util.*;
public class Universe {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner ip = new Scanner(System.in);
		int num;
		while(true)
		{
			num = ip.nextInt();
			if(num == 42)
			{
				break;
			}
			else {
			     System.out.println(num);
			}
		}
		ip.close(); 
         
    }
}
