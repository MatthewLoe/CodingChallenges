package StringChallenges;

import java.util.HashSet;

public class RemoveDuplicateChar
{
    public static void main(String args[])
    {
        String[] data = {"aaabbb", "abcd", "aaaa", "aababscs"};

        System.out.println("Remove duplicates and create unique string.");

        for (String input: data)
        {
            String output = removeDuplicates(input);

            System.out.println("Input: "+ input);
            System.out.println("Output: "+ output);
        }
        //END FOR
    }

    private static String removeDuplicates(String input)
    {
        HashSet<Character> known = new HashSet<Character>();
        char[] characters = input.toCharArray();

        for (int ii = 0; ii < input.length(); ii++)
        {
            if (known.contains(characters[ii]))
            {
                characters[ii] = '0';
            }
            else
            {
                known.add(characters[ii]);
            }
            //END IF
        }
        //END FOR
        String str = "";

        for (char ch: characters)
        {
            if (ch != '0')
            {
                str += ch;
            }
            //END IF
        }
        //END FOR

        return str;
    }

    
}