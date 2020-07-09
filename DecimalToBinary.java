public class DecimalToBinary
{
    public static void main(String[] args)
    {
        int input = 279;
        
        System.out.println("Converting decimal to binary");
        System.out.println("Input: "+ input);

        System.out.println("Java Converter");
        System.out.println("Output: "+ Integer.toBinaryString(input));

        System.out.println("My own Converter");
        byte[] arr = converter(input);

        System.out.print("Output: ");

        for (byte num: arr)
        {
            System.out.print(num);
        }
        //END FOR
    }

    private static byte[] converter(int num)
    {
        byte[] binary = new byte[32];  
        int idx = 31;    //Starting array index at end for least significant bit

        while (num > 0 && idx >= 0)
        {
            binary[idx] = (byte) (num % 2); //Get 1 or 0
            num = num / 2;
            idx--;  //Decrease index position to reach start of array
        }
        //END IF

        return binary;
    }
}