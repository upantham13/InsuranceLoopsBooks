
/**
 * Calculates the factorial and sum of powers of two using loops.
 *
 * @author Umasathvik Pantham
 * @version 03/20/2021
 */
public class LoopyFun
{
    // instance variables - replace the example below with your own
    private int posNum;

    /**
     * Constructor for objects of class LoopyFun
     * 
     * @param num the number used for calculations
     */
    public LoopyFun(int num)
    {
        if (num == 0)
        {
            num = 1;
            posNum = num;
        }
        
        else 
        {
            posNum = Math.abs(num);
        }
    }

    /**
     * Gets the stored integer.
     *
     * @return posNum the number that is stored
     */
    public int getNum() 
    {
        return posNum;
    }
    
    /**
     * Calculates and returns the factorial of the stored integer
     *
     * @return factorialNum the factorial of posNum
     */
    public int factorial() 
    {
        int factorialNum = 1;
        for (int i = 1; i <= posNum; i++)
            factorialNum = factorialNum * i; 
        return factorialNum;
    }
    
    /**
     * Calculates and returns the sum of powers oftwo for all integer 
     * powers from 0 (inclusive) to the stored integer (exclusive)
     * 
     * @return sumOfPowersOfTwo the sum of powers of two till posNum
     */
    public int sumOfPowersOfTwo() 
    {
        int sumOfPowersOfTwo = 0;
        for (int i = 0; i <= posNum; i++)
            sumOfPowersOfTwo = (int)Math.pow(2, i);   
        return sumOfPowersOfTwo;
    }
}
