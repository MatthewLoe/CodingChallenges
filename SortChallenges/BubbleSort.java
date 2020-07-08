package SortChallenges;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};

        System.out.println("Bubble Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] A)
    {
        int temp, pass;
        boolean sorted;
        
        pass = 0;    
    
        do //Loop to completely sort the array
        {
            sorted = true;
            for (int ii = 0; ii < (A.length - 1 - pass); ii++) //Loop allows
            {                                                //sorting of value
                                                             //to correct place
                if (A[ii] > A[ii+1]) 
                {
                    temp = A[ii];     //Swaps larger A[ii]
                    A[ii] = A[ii+1];  //with smaller A[ii+1]
                    A[ii+1] = temp;
                    sorted = false;
                }
                //END IF 
            }
            //END FOR
            pass = pass + 1; //Counter records number of sorted values
        }
        while (!sorted);
        //END DO-WHILE
    }
}