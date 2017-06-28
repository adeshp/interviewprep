/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

/**
 *
 * @author v-akdesh
 */
public class ReverseInorder {
    int sum=0;
    public static void rev(Node root, int sum)
    {
        if(root == null)
            return;
        rev(root.right, sum);
        sum = sum + root.data;
        root.data = sum;
        rev(root.left, sum);
    }
}
