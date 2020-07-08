package ArrayChallenges;

import java.util.Arrays;

public class ReverseArray
{

    public static void main(String args[])
    {
        int[] input = {1,2,2,2,3,3,4,5,6,6,7};

        int[] arr = input.clone();

        System.out.println("Reverse array");
        System.out.println("Input: "+Arrays.toString(input));

        reverse(arr);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void reverse(int[] arr)
    {
        for (int ii = 0; ii < arr.length / 2; ii++)
        {
            int tmp = arr[ii];
            arr[ii] = arr[arr.length - ii - 1];
            arr[arr.length - ii - 1] = tmp;
        }
    }
}