public class PrimesUpToIdx
{
    public static void main(String args[])
    {
        int input = 100;

        for (int ii = 2; ii < input; ii++)
        {
            boolean isPrime = true; //Assume prime
            //Test numbers up to half of ii as the other half 
            //would need the first half as a factor
            for (int jj = 2; jj <= ii/2; jj++)  
            {
                if (ii % jj == 0)
                {
                    isPrime = false;
                    break;
                }
                //END IF
            }
            //END FOR

            if (isPrime)
            {
                System.out.println(ii);
            }
            //END IF
        }
        //END FOR
    }
    
}