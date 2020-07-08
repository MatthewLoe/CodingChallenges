package SortChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort
{
    public static void main(String args[])
    {
        int[] input = {181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12};

        System.out.println("Radix Sort");
        System.out.println("Input: "+Arrays.toString(input));
        
        sort(input);

        System.out.println("Output: "+Arrays.toString(input));
    }

    public static void sort(int[] arr)
    {
        //Number of buckets = 10 which is number of numerals in decimal system
        final int RADIX = 10;

        //Create and initialize bucket
        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int ii = 0; ii < bucket.length; ii++)
        {
            bucket[ii] = new ArrayList<Integer>();
        }
        //END FOR

        boolean maxLength = false; 
        int placement = 1;
        int tmp = -1;

        while (!maxLength)  //Check highest order reached
        {
            maxLength = true; //Assume reached highest order

            for (Integer ii: arr)
            {
                tmp = ii / placement;   //Get value at order E.g ii=123 placement=10 -> tmp=2
                bucket[tmp % RADIX].add(ii);    //Add to bucket

                if (maxLength && tmp > 0)   //Check if not reached highest order
                {
                    maxLength = false;
                }
                //END IF
            }
            //END FOR

            int aa = 0; //Position in array 
            for (int bb = 0; bb < RADIX; bb++)  //Loop from 0-9 numerals
            {
                for (Integer ii : bucket[bb])   //All numbers in list
                {
                    arr[aa] = ii;     //Add to correct position based on order
                    aa++;
                }
                //END FOR

                bucket[bb].clear();     //Clears list
            }
            //END FOR

            placement *= RADIX;     //Increase order E.g. Ones -> Tens -> Hundreds -> etc
        }
        //END WHILE

    }
}