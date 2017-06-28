/*
 Generates the binary tree.
 */
package BinaryTreeProblems;

/**
 *
 * @author v-akdesh
 */
public class LevelLinkedLists {
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
        Node n9 = new Node(9);
        n8.left = n9;
        
    }
}
