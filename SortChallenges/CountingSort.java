import java.util.Arrays;

public class CountingSort
{
    public static void main(String args[])
    {
        int[] arr = {9,1,2,37,7,3,9,4,2,8,4,6,5,2,0};
        int k = 37;

        System.out.println("Bucket Sort");
        System.out.println("Input: "+Arrays.toString(arr));
        
        sort(arr, k);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void sort(int[] arr, int k)
    {
        //Count array of length k, which is the max number
        int[] count = new int[k + 1];

        for(int ii: arr)
        {
            count[ii]++;
        }
        //END FOR EACH

        int idx = 0;

        for (int ii = 0; ii < count.length; ii++)
        {
            while (count[ii] > 0)
            {
                arr[idx] = ii;
                count[ii]--;
                idx++;
            }
            //END WHILE
        }
        //END FOR
    }
}