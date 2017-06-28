/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

public class BinaryTreeMirror {
    public static boolean isTreeMirrored(Node root)
    {
        if(root!=null) 
        {
            return rec(root.left, root.right);
        }
        return false;
    }
    
    public static boolean rec(Node a, Node b)
    {
       if(a == null && b == null) return true;
       if(a== null ^ b == null) return false;
       if(a.data == b.data) 
       {
           return rec(a.left, b.right) && rec(a.right, b.left);
       }
       else
       {
           return false;
       }
            
    }
}
