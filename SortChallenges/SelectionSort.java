package SortChallenges;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};

        System.out.println("Selection Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] A)
    {
        int minIdx, temp;

        for (int nn = 0; nn < A.length; nn++) 
        {
            minIdx = nn;

            for(int jj = nn + 1; jj < A.length; jj++) //Loops through excluding
            {                                         //A[0]
                if (A[jj] < A[minIdx])
                {
                    minIdx = jj; //Stores index of smallest value
                }
                //END IF
            }
            //END FOR
            
            temp = A[minIdx];   //Swaps found smallest value with A[minIdx] 
            A[minIdx] = A[nn];
            A[nn] = temp;
        }
        //END FOR
    }
}