package interviewprep;
class Nodee
 {
     int data;
     Nodee next;
     Nodee(int data)
     {
         this.data = data;
         this.next = null;
     }
 }

public class LinkedList 
{
    Nodee head;
    Nodee last;
    int count;
    LinkedList()
    {
        head = null;
        count = 0;
    }
    
    public void addNode(int data)
    {
     Nodee item = new Nodee(data);
     if(count == 0)
     {
         head = item;
         last = head;
         
     }
     else
     {
         last.next = item;
         last = item;
     }
     count++;
     }
    
    public void printList()
    {
        if(count==0)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
            Nodee iterator = head;
            while(iterator != null)
            {
                System.out.println(iterator.data);
                iterator = iterator.next;
            }
        }
    }
}

