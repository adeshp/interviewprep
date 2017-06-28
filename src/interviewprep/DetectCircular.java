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
public class DetectCircular {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(1);
        list.printList();
        System.out.println();
    }
}
