package ArrayChallenges;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber
{
    public static void main(String args[])
    {
        int[] input = {1,2,3,4,6,7,9,10};
        int totalCount = 10;

        System.out.println("Find Missing Numbers");
        System.out.println("Using BitSet");
        System.out.println("Input: "+ Arrays.toString(input));

        int missingCount = totalCount - input.length;
        BitSet set = new BitSet(totalCount);

        for (int ii = 0; ii < input.length; ii++)
        {
            set.set(input[ii] - 1);
        }
        //END FOR

        int lastMissing = 0;

        for (int ii = 0; ii < missingCount; ii++)
        {
            lastMissing = set.nextClearBit(lastMissing) + 1;
            System.out.println(lastMissing);
        }
        //END FOR

        input = new int[]{1,2,3,4,6,7,8,9,10};
        System.out.println("Using Summation - Only works for 1 number.");
        System.out.println("Input: "+ Arrays.toString(input));

        int expectedSum = totalCount * (totalCount + 1) / 2;
        int actualSum = 0;

        for (int ii = 0; ii < input.length; ii++)
        {
            actualSum += input[ii];
        }
        //END FOR

        System.out.println(expectedSum - actualSum);
    }
}