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
public class KthElementFromLast {
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
        System.out.println("Enter the position from last of the list to get that node.");
        Scanner ip1 = new Scanner(System.in);
        int position = ip1.nextInt();
        //trivialNthToLast(position, list);
        System.out.println("========================================================");
        System.out.println(KthToLast(list, position));        
    }
    
    public static void trivialNthToLast(int position, LinkedList list)
    {
        //Note that any Kth position from the end of the list means, we can formulate 
        //the node's position from the first of the list.
        int size = list.count;
        if(position <= size && position >0)
        {
            int positionFromStart = size - position + 1;
            int i=1;
            Nodee temp = list.head;
            while(i!=positionFromStart)
            {
             temp = temp.next;
             i++;
            }
            System.out.println(temp.data);
            System.out.println("+++++++++++++++++++++++++++++++++");
            
        }
        else
        {
            System.out.println("You entered wrong position value. It overflows/underflows the list size.");
        }
    }
    
    public static int KthToLast(LinkedList list, int k)
    {
        Nodee p1 = list.head;
        Nodee p2 = list.head;
        for(int i=0; i<k; i++)
        {
            if(p1 == null)
                    return -1;
            p1 = p1.next;
        }
        
        while(p1 != null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        
        return p2.data;
    }
}
