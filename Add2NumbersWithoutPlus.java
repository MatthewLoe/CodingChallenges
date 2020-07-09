public class Add2NumbersWithoutPlus
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 30;    

        System.out.println("Add two numbers without plus sign");
        System.out.println("Input: "+a+", "+b);
        System.out.println("Iterative");
        System.out.println("Output: "+iterative(a, b));
        System.out.println("Recursive");
        System.out.println("Output: "+recursive(a, b));
    }

    private static int iterative(int a, int b)
    {
        while (b != 0)
        {
            int carry = (a & b) << 1;

            a = a ^ b;

            b = carry;
        }
        //END WHILE

        return a;
    }

    private static int recursive(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        //END IF

        int sum = (a ^ b);
        int carry = (a & b) << 1;

        return recursive(sum, carry);
    }
    
}