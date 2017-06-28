/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeProblems;

/**
 *
 * @author v-akdesh
 */
public class CheckBinaryTreeBalanced {
    public static void main(String[] args)
    {
        
        BinaryTree bt = new BinaryTree();
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        root.left = n1;
        root.right = n2;
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.left = n4;
        n1.right = n5;
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n2.left = n6;
        n2.right = n7;
        Node n8 = new Node(8);
        n7.right = n8;
//        Node n9 = new Node(9);
//        n8.left = n9;
        
        int h = 0;
       
        Boolean resp = isBalanced(root);
        if(resp)
        {
            System.out.println("Balanced.");
        }
        else
        {
            System.out.println("Not Balanced.");
        }
    }
    
    public static Boolean isBalanced(Node root)
    {
        return isBinaryTreeBalanced(root) != Integer.MIN_VALUE;
    }
    
    public static int isBinaryTreeBalanced(Node root)
    {
        if(root == null)
            return -1;
        int leftHt = isBinaryTreeBalanced(root.left);
        if(leftHt == Integer.MIN_VALUE) { return Integer.MIN_VALUE ;}
        int rightHt = isBinaryTreeBalanced(root.right);
        if(rightHt == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        int htDiff = leftHt - rightHt;
        if(Math.abs(htDiff) > 1)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
           return Math.max(leftHt, rightHt) + 1;
        }
        
    }
}
