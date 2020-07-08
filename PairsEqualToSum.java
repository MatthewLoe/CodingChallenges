import java.util.Arrays;
import java.util.HashSet;

public class PairsEqualToSum
{
    public static void main(String args[])
    {
        int[] input = {0, 14, 0, 4, 7, 8, 3, 5, 7};
        int sumTarget = 8;

        System.out.println("Find all pairs whose sum equals the target");
        System.out.println("Input: "+Arrays.toString(input));

        System.out.println("Using nested loops");
        findPairsBasic(input, sumTarget);

        System.out.println("Using hash set");
        findPairsSet(input, sumTarget);

    }

    private static void findPairsBasic(int[] input, int sum)
    {
        for (int ii = 0; ii < input.length; ii++)
        {
            for (int jj = ii + 1; jj < input.length; jj++)
            {
                if (input[ii] + input[jj] == sum)
                {
                    System.out.println("("+input[ii]+", "+input[jj]+")");
                }
                //END IF
            }
            //END FOR
        }
        //END FOR
    }

    //Doesn't show duplicate pairs or reverse pairs
    private static void findPairsSet(int[] input, int sum)
    {
        HashSet<Integer> set = new HashSet<Integer>();  //Set of known numbers

        for (int number: input) //Loop over all numbers
        {
            int tmp = sum - number;
            if (set.contains(tmp))  //Check if other number exists
            {
                System.out.println("("+tmp+", "+number+")"); 
            }
            //END IF
            set.add(number);    //Add number to set
        }
        //END FOR

    }
}