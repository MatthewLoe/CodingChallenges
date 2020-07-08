package SortChallenges;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};

        System.out.println("Merge Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] A)
    {
        mergeSortRecurse(A, 0, A.length-1);
    }

    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
        int midIdx;

        if (leftIdx < rightIdx) //Checks larger than one element
        {
            midIdx = (leftIdx + rightIdx) / 2; //Gets middle index

            mergeSortRecurse(A, leftIdx, midIdx);            
            mergeSortRecurse(A, midIdx + 1, rightIdx);
 
            merge(A, leftIdx, midIdx, rightIdx);
        }
        //END IF
    }

    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
        int[] tempArr = new int[(rightIdx - leftIdx + 1)];
        int ii = leftIdx; 
        int jj = midIdx + 1; 
        int kk = 0;

        while (ii <= midIdx && jj <= rightIdx)
        {
            if (A[ii] <= A[jj])  //Checks which value of sub arrays is smaller
            {
                tempArr[kk] = A[ii]; //Assign from left
                ii = ii + 1;
            }
            else
            {
                tempArr[kk] = A[jj]; //Assign from right
                jj = jj + 1;
            }
            //END IF

            kk = kk + 1;
        }
        //END WHILE

        for (ii = ii; ii <= midIdx; ii++)  //Sorts in rest of left array
        {
            tempArr[kk] = A[ii];
            kk = kk + 1;
        }
        //END FOR

        for (jj = jj; jj <= rightIdx; jj++) //Sorts in rest of right array
        {
            tempArr[kk] = A[jj];
            kk = kk + 1;
        }
        //END FOR

        for (kk = leftIdx; kk <= rightIdx; kk++) //Copies sorted array to orignal
        {                                        //array
            A[kk] = tempArr[kk - leftIdx];
        }
        //END FOR
    }
}