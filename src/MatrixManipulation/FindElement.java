/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixManipulation;

/**
 *
 * @author v-akdesh
 */
public class FindElement {
   public static void main(String[] args)
   {
       int[][] mat = {{ 15, 20, 40, 85}, { 20, 35, 80, 95}, { 30, 55, 95, 105}, { 40, 80, 100, 120}};
       boolean place = findPlace(mat, 16);
       System.out.println(place);
   }
   public static boolean findPlace(int[][] mat, int num)
   {
       int row = 0;
       int col = mat[0].length - 1;
       while(row < mat.length && col >= 0)
       {
           if(mat[row][col] == num)
           {
               return true;
           }
           else if(mat[row][col] > num)
           {
               col--;
           }
           else
           {
               row++;
           }
       }
       return false;
   }
}
