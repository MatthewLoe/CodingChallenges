package SortChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort
{
    public static void main(String args[])
    {
        int[] arr = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};

        System.out.println("Bucket Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] arr)
    {
        //Get hash codes
        final int[] code = hash(arr);

        //Initialize buckets
        List<Integer>[] buckets = new List[code[1]];

        for (int i = 0; i < code[1]; i++)
        {
            buckets[i] = new ArrayList<Integer>();
        }
        //END FOR
    
        //Distribute data into buckets: O(n)
        for (int i : arr)
        {
            System.out.println(hash(i,code));
            buckets[hash(i, code)].add(i);
        }
        //END FOR
        
        //Sort each bucket O(n)
        for (List<Integer> bucket : buckets)
        {
            Collections.sort(bucket);
        }
        //END FOR
        
        int ndx = 0;

        //Merge the buckets: O(n)
        for (int b = 0; b < buckets.length; b++)
        {
            System.out.println("Bucket: "+b);
            for (int v : buckets[b])
            {
                System.out.println("Number: "+v);
                arr[ndx++] = v;
            }
            //END FOR
        }
        //END FOR

    }

    private static int[] hash(int[] input)
    {
        int m = input[0];

        //Find largest number
        for (int i = 1; i < input.length; i++)
        {
            if (m < input[i])
            {
                m = input[i];
            }
        }
        //END FOR

        return new int[] { m, (int) Math.sqrt(input.length) };
    }
  
    private static int hash(int i, int[] code)
    {
        return (int) ((double) i / code[0] * (code[1] - 1));
    }
}