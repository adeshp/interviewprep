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
class RankNode{
    int data;
    RankNode left, right;
    int left_size = 0;
    public RankNode(int d)
    {
        data = d;
    }
    public void track(int d)
    {
        if(d < data)
        {
            if(left != null)
            {
                left.track(d);
            }
            else
            {
                left = new RankNode(d);
            }
            left_size++;
        }
        else{
            if(right != null)
            {
                right.track(d);
            }
            else
            {
                right = new RankNode(d);
            }
        }
    }
    
    public int getRankOfNumber(int num)
    {
        if(data == num)
        {
            return left_size;
        }
        else if(num < data)
        {
            if(left == null)
            {
                return -1;
            }
            else
            {
                return left.getRankOfNumber(num);
            }
        }
        else
        {
            int rightsize = right == null ? -1 : right.getRankOfNumber(num);
            if(rightsize == -1) return -1;
            else return left_size + 1 + rightsize;
            
        }
    }
          
}

public class StreamIndexing {
    public static void main(String[] args)
    {
        int[] arr = { 20, 15, 25, 10, 23, 5, 13, 24};
        RankNode r = new RankNode(20);
        r.track(15);
        r.track(25);
        r.track(10);
        r.track(23);
        r.track(5);
        r.track(13);
        r.track(24);
        System.out.println(r.getRankOfNumber(23));
    }
}
