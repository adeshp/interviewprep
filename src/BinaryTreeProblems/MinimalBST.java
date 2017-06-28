/*
 * Create Minimal BST from a increasing-sorted array 
 
 */
package BinaryTreeProblems;
import java.util.*;

/**
 *
 * @author v-akdesh
 */
public class MinimalBST {

    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements in array.");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the array elements.");
        for(int i=0; i<size; i++)
        {
            arr[i] = ip.nextInt();
        }
        System.out.println("creating...");
        BinaryTree tr = new BinaryTree();
        tr.root = createSearchBinaryTree(arr);
        System.out.println(tr.root.key);
    }
       
    public static Node createSearchBinaryTree(int[] arr) {
        return createSearchBinaryTree(arr, 0, arr.length-1);
    }
    public static Node createSearchBinaryTree(int[] arr, int start, int end)
    {
        if(end < start)
            return null;
        int mid = (start + end)/2;
        Node n = new Node(arr[mid]);
        n.left = createSearchBinaryTree(arr, start, mid-1);
        n.right = createSearchBinaryTree(arr, mid+1, end);
        return n;
    }
    
}
