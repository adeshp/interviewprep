/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author v-akdesh
 */
public class CheckDup {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(4);
        list.addNode(5);
        list.printList();
        removeDups(list.head);
        System.out.println("******************************");
        list.printList();
    }
    public static void removeDups(Nodee temp)
    {
        Set<Integer> st = new HashSet();
        Nodee prev = null;
        while(temp != null)
            {
             if(st.contains(temp.data))
             {
                 prev.next = temp.next;
             }
             else
             {
                 st.add(temp.data);
                 prev = temp;
             }
             temp = temp.next;
            }
        
    }
}
