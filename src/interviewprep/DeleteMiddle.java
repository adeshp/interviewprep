/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.Scanner;

/**
 *
 * @author v-akdesh
 */
public class DeleteMiddle {
    public static void main(String[] args)
    {
    LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.printList();
        System.out.println("Enter the node to be deleted.");
        Scanner ip1 = new Scanner(System.in);
        int position = ip1.nextInt();
        delMiddile(position, list);
        System.out.println("========================================================");
        list.printList();
    }
    public static void delMiddile(int position, LinkedList list)
    {
        Nodee next = list.head.next;
        next.data = list.head.data;
        next.next = next.next.next;
    }
    
}
