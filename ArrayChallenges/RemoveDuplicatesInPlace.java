import java.util.Arrays;
import java.util.HashSet;

//Removes duplicates from some sorted array
public class RemoveDuplicatesInPlace
{
    public static void main(String args[])
    {
        int[] input = {1,2,2,2,3,3,4,5,6,6,7};

        int[] arr = input.clone();

        System.out.println("Remove duplicates");
        System.out.println("Input: "+Arrays.toString(arr));

        System.out.println("Using Collections Set");

        

        System.out.println("Output: "+removeDuplicatesSet(arr).toString());

        System.out.println("Without Collections Set");

        arr = input.clone();
        removeDuplicates(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }
    

    //With Collections
    private static HashSet<Integer> removeDuplicatesSet(int[] arr)
    {
        HashSet<Integer> noDuplicates = new HashSet<Integer>();

        for (int ii: arr)
        {
            noDuplicates.add(ii);
        }
        //END FOR

        return noDuplicates;
    }

    //In place without collections
    //Defaults value to 0
    private static void removeDuplicates(int[] arr)
    {
        int prev = arr[0];

        for (int ii = 1; ii < arr.length; ii++)
        {
            if (arr[ii] == prev)
            {
                arr[ii] = 0;
            }
            else
            {
                prev = arr[ii];
            }
            //END IF
        }
        //END FOR
    }
}