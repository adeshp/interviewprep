/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author v-akdesh
 */
public class IsListPalindrome {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(0);
        list.printList();
        System.out.println(isPalindrome(list));
    }
    public static String isPalindrome(LinkedList l)
    {
        if(l.head == null)
        {
            return "Null";
        }
        Deque<Integer> st = new ArrayDeque();
        Nodee temp = l.head;
        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = l.head;
        while(temp != null)
        {
            if(temp.data != st.pop())
                return "No";
            temp = temp.next;
        }
        return "Yes";
    }
}
