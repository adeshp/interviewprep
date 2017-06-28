package interviewprep;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class UniqueCharsInString {
    public static void main(String[] args)
    {
        System.out.println("Please enter the string.");
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Map<Character, Integer> dict = new HashMap();
        ip.close();
        int count =0;
        for(int i=0; i<str.length(); i++)
        {
            if(dict.put(str.charAt(i), i) != null)
            {
               count++; 
            }
        }
        
        if(count == 0)
        {
            System.out.println("All unique characters");
        }
        else
        {
            System.out.println("Not all unique characters");
        }
        
    }
}
