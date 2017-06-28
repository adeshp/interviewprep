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
public class BinaryTree {
    public Node root;
}

class Node
{
    public int key;
    public Node left;
    public Node right;
    Node(int key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
