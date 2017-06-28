/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;
import java.util.*;
/**
 *
 * @author v-akdesh
 */
public class UtilClass {
 public static String GetInputString()
 {
     System.out.println("Enter the string");
     Scanner ip = new Scanner(System.in);
     String str = ip.nextLine();
     return str;
 }
 
 public static int[] GetInputArray()
 {
     System.out.println("Enter the size of the array");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = ip.nextInt();
        }
        return arr;
 }
}
