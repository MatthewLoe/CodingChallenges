public class Swap2NumWithoutTmp
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;

        System.out.println("Swap 2 numbers without tmp variable");
        System.out.println("Using maths");

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        a = a + b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        b = a - b;   //(a + b) - (b), so now b is equal to a
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        a = a - b;   //(a + b) -(a), now a is equal to b
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("Using XOR");

        a = 30;
        b = 60;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        a = a ^ b;  //1010 XOR 0011 -> 1001
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        b = a ^ b;  //1001 XOR 0011 -> 1010
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("");
        a = a ^ b;  //1001 XOR 1010 -> 0011
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}