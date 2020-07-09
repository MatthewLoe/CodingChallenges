package StringChallenges;

import java.util.Arrays;

public class AnagramChecker
{
    public static void main(String[] args)
    {
        String[][] data = {
            {"word", "wrdo"},
            {"mary", "army"},
            {"pure", "in"},
            {"a","a"},
            {"b","bbbb"},
            {"sleep","slepa"},
            {"bota","boat"}
        };
    
        for (String[] test: data)
        {
            System.out.println("Input: "+test[0]+ ", "+test[1]);
            System.out.println("Output");
            boolean flag = brute(test[0], test[1]);
            System.out.println("Brute: "+flag);
            flag = arrayCheck(test[0], test[1]);
            System.out.println("Array: "+flag);
            System.out.println("");
        }
        //END FOR
    }
    
    private static boolean brute(String word, String anagram)
    {
        if (word.length() != anagram.length())
        {
            return false;
        }
        else
        {
            for (char ch: word.toCharArray())
            {
                int index = anagram.indexOf(ch);
                if (index != -1)    //Check character exists
                {
                    //Remove same letter
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1);
                }
                else
                {
                    return false;   //Not anagrams
                }
                //END IF
            }
            //END FOR

            return anagram.isEmpty();   //True -> Are anagrams
        }
        //END IF 
    }

    private static boolean arrayCheck(String word, String anagram)
    {
        if (word.length() != anagram.length())  //Check same length
        {
            return false;   
        }
        else
        {
            char[] chars1 = word.toCharArray();
            char[] chars2 = anagram.toCharArray();

            Arrays.sort(chars1);    //Sort characters
            Arrays.sort(chars2);

            //Return boolean of comparison
            return Arrays.equals(chars1, chars2);
        }
        //END IF
    }
}
