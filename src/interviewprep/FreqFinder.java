
package interviewprep;
import java.util.*;

public class FreqFinder {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = ip.nextInt();
        }
        int freq = 0;
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i=0; i<size; i++)
        {
            if(dict.containsKey(arr[i]))
            {
                dict.put(arr[i], dict.get(arr[i])+1);
            }
            else
            {
                dict.put(arr[i], 1);
            }
        }
        System.out.println("Enter the number whose frequency is to be found.");
        int f = ip.nextInt();
        if(dict.containsKey(f))
        {
            System.out.print(dict.get(f));
        }
        else
        {
            System.out.print(0);
        }
        
    }
    
}
