package SortChallenges;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};

        System.out.println("Quick Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] A)
    {
        quickSortRecurse(A, 0, A.length - 1);
    }

    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
        int pivotIdx, newPivotIdx;
       
        if(rightIdx > leftIdx)  //Checks array is larger than one
        {
            pivotIdx = (leftIdx + rightIdx) / 2;  
            newPivotIdx = doPartitioning(A, leftIdx, rightIdx, pivotIdx);

            quickSortRecurse(A, leftIdx, newPivotIdx - 1);
            quickSortRecurse(A, newPivotIdx + 1, rightIdx);
        }
        //END IF
    }

    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
        int pivotVal, newPivotIdx, temp, currIdx;

        pivotVal = A[pivotIdx];
        A[pivotIdx] = A[rightIdx]; //Swap pivot value with rightmost value
        A[rightIdx] = pivotVal;

        currIdx = leftIdx;

        for (int ii = leftIdx; ii < rightIdx; ii++) //Loops through array
        {
            if(A[ii] < pivotVal) //Checks if smaller than pivot
            {
                temp = A[ii];
                A[ii] = A[currIdx];  //Places value in left side of array
                A[currIdx] = temp;
                currIdx = currIdx + 1;
            }
            //END IF
        }
        //END For

        newPivotIdx = currIdx;
        A[rightIdx] = A[newPivotIdx];
        A[newPivotIdx] = pivotVal;

		return newPivotIdx;
    }
}