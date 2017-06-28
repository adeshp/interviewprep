package interviewprep;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveRepititiveChar {
    public static void main(String[] args)
    {
        String str = UtilClass.GetInputString();
        Map<Character, Integer> dict = new HashMap();
        for(int i=0; i<str.length(); i++)
        {
            if(!dict.containsKey(str.charAt(i)))
            {
                dict.put(str.charAt(i), 1);
            }
            else
            {
                dict.put(str.charAt(i), dict.get(str.charAt(i))+1);
            }
        }
        
        System.out.print(Collections.max(dict.values()));
    }
}