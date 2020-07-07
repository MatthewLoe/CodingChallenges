public class StringReverse
{
    public static void main(String args[])
    {
        String input = "Hello World";
        String output = "";
        char[] arr = input.toCharArray();
        
        System.out.println("Reverse a string.");
        System.out.println("Iteratively");
        System.out.println("Input: "+input);

        for (int ii = input.length() - 1; ii >= 0; ii--)
        {
            output = output + arr[ii];
        }
        //END FOR

        System.out.println("Output: " + output);

        System.out.println("Recursively");

        System.out.println("Output: "+ reverse(input));
    }

    private static String reverse(String str)
    {
        System.out.println(str);

        if (str.length() < 2)   //Base Case
        {
            return str;
        }
        //END IF

        return reverse(str.substring(1)) + str.charAt(0);
    }
    
}