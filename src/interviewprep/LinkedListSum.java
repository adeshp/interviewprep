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
public class LinkedListSum {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.printList();
        
        LinkedList l = new LinkedList();
        l.addNode(9);
        l.addNode(9);
        l.addNode(9);
        l.printList();
        
        LinkedList sumed = getLinkedListSum(list, l);
        sumed.printList();        
    }
    
    public static LinkedList getLinkedListSum(LinkedList l1, LinkedList l2)
    {
        LinkedList sumed = new LinkedList();
        if(l1.head == null && l2.head == null){
             return null;
        }
        Nodee h1 = l1.head;
        Nodee h2 = l2.head;
        int carry = 0;
        int pos = 0;
        int temp = 0;
        while(h1!=null && h2!=null)
        {
            temp = h1.data + h2.data + carry;
            pos = temp%10;
            sumed.addNode(pos);
            pos = 0;
            if(temp >= 10)
            { carry = temp/10;}
            h1 = h1.next;
            h2 = h2.next;
        }
        //Now once the while loop ends we need to check below conditions:
        //  1. Carry is not zero: it is not then create a node and add to the list.
        //  2. h1 is null but h2 is not null, then create a node and add the carry to the new node. If it still produces
        // one more carry and then add it to the list.
        //  3. Repeat the step 1 and step 2 for the h2 too.
        if(h1 == null && h2 != null)// means get the list2 remaining niodes and add them to the add along with the carry
        {
            while(h2 != null)
            {
                temp = h2.data + carry;
                pos = temp%10;
                sumed.addNode(pos);
                pos = 0;
                if(temp >= 10)
                {
                    carry = temp/10;
                }
                h2 = h2.next;
            }
        }
        if(h2 == null && h1 != null)// means get the list1 remaining niodes and add them to the add along with the carry
        {
            while(h1 != null)
            {
                temp = h1.data + carry;
                pos = temp%10;
                sumed.addNode(pos);
                pos = 0;
                if(temp >= 10)
                {
                    carry = temp/10;
                }
                h1 = h1.next;
            }
        }
        if(carry > 0){
                sumed.addNode(carry);
        }
        return sumed;
    }
}
