import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar
{
    public static void main(String args[])
    {
        String input = "swiss";
        
        System.out.println("Find first non-repeated character.");
        System.out.println("Input: "+input);
        System.out.println("LinkedHashMap Method");

        try
        {
            System.out.println("Output: " + getFirstNonRepeated(input));
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        //END TRY-CATCH

        System.out.println("LinkedHashMap Method");

        try
        {
            System.out.println("Output: " + findFirstNonRepeated(input));
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        //END TRY-CATCH

    }

    //Method using a LinkedHashMap
    private static char getFirstNonRepeated(String str)
    {
        //New counter map with length same as input length
        Map<Character,Integer> count = new LinkedHashMap<>(str.length());

        for (char ch: str.toCharArray())    //Count occurrences
        {
            if (count.containsKey(ch))
            {
                count.put(ch, count.get(ch) + 1);
            }
            else
            {
                count.put(ch, 1);
            }
            //END IF
        }
        //END FOR EACH

        //Loops in order of appearance and checks number of repeats
        for (Entry<Character,Integer> entry: count.entrySet())
        {
            if (entry.getValue() == 1)  //Check never repeats
            {
                return entry.getKey();
            }
        }
        //END FOR EACH

        //Throw error if no letter found
        throw new RuntimeException("Failed to find first non-repeated letter.");
    }

    //Method using HashMap
    private static char findFirstNonRepeated(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();

        //Build map
        for (char ch: str.toCharArray())    //Count occurrences
        {
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
            //END IF
        }
        //END FOR EACH

        //Loop through string
        for (char ch: str.toCharArray())
        {
            if (map.get(ch) == 1)
            {
                return ch;
            }
            //END IF
        }
        //END FOR EACH

        //Throw error if no letter found
        throw new RuntimeException("Failed to find non-repeated character.");
    }
}