/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeProblems;

import java.util.ArrayList;

/**
 *
 * @author v-akdesh
 */
public class ValidateBST {
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        Node root = new Node(7);
        Node n1 = new Node(5);
        Node n2 = new Node(15);
        root.left = n1;
        root.right = n2;
        Node n4 = new Node(4);
        Node n5 = new Node(6);
        n1.left = n4;
        n1.right = n5;
        Node n6 = new Node(10);
        Node n7 = new Node(25);
        n2.left = n6;
        n2.right = n7;
        Node n8 = new Node(13);
        Node n9 = new Node(40);
        n7.right = n9;
        n7.left = n8;
        
        Node n10 = new Node(2);
        n4.left = n10;
        
        Node n11 = new Node(1);
        //Node n12 = new Node(0);
        n10.left = n11;
        
        System.out.println(isBST(root));
    }
    
    public static String isBST(Node root)
    {
        Boolean check = BSTCheck(root, null, null);
        return check ? "Balanced" : "Not Balanced";
    }
    public static Boolean BSTCheck(Node root, Integer min, Integer max)
    {
        if(root == null)
            return true;
        if((min != null && root.key <= min) || (max != null && root.key > max))
            return false;
        if(!BSTCheck(root.left, min, root.key) || !BSTCheck(root.right, root.key, max))
            return false;
        
        return true;
    }
    
}
