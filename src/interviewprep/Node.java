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
public class Node {
    int data;
    Node left;
    Node right;
    
    Node(Node left, Node right)
    {
        this.left = left;
        this.right = right;
    }
}
