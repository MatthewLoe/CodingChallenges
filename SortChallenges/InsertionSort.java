import java.util.Arrays;

public class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};

        System.out.println("Insertion Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] A)
    {
        int temp, ii;
    
        for (int nn = 1; nn < A.length; nn++) 
        {
            ii = nn;
            temp = A[ii]; //Records last value

            while (ii > 0 && A[ii-1] > temp) //Checks value against sorted values
            {
                A[ii] = A[ii-1];  //Shuffle until correct location
                ii = ii - 1;
            }
            //END WHILE
            A[ii] = temp; 
        }
        //END FOR
    }
}