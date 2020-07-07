public class StringToInt
{
    public static void main(String args[])
    {
        String input = "3254";
        int num = 0;

        System.out.println("Converts string to integer.");
        System.out.println("Input: "+input);

        for (int ii = 0; ii < input.length(); ii++)
        {
            char ch = input.charAt(ii);

            num = num * 10 + (ch - '0');
        }
        //END FOR

        System.out.println("Output: "+num);


    }
}