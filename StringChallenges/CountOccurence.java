package StringChallenges;

public class CountOccurence
{
    public static void main(String args[])
    {
        String input = "Today is Monday";
        char targetChar = 'a';
        int counter = 0;

        System.out.println("Counts occurences of the letter 'a'.");
        System.out.println("Input: "+input);
        System.out.println("For Loop");

        for (int ii = 0; ii < input.length(); ii++)
        {
            if (input.charAt(ii) == targetChar)
            {
                counter++;
            }
            //END IF
        }
        //END FOR

        System.out.println("The letter 'a' occured "+counter+" times.");

        counter = 0;
        System.out.println("For Each Loop");

        for (char ch: input.toCharArray())
        {
            if (ch == targetChar)
            {
                counter++;
            }
            //END IF
        }
        //END FOR EACH

        System.out.println("The letter 'a' occured "+counter+" times.");
    }
}