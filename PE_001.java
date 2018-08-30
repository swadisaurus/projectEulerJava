/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=1
 * @Question If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class PE_001
{
  public static void main(String args[])
  {
    int sum=0;//will represent the sum of all multiples of 3 & 5

    for(int i=1;i<1000;i++)//traverse all values between 1 and 1000
    {
      if((i%3==0 || i%5==0))//determines if i is a multiple of 3 or 5
      {
        sum+=i;//adds i to final value
      }
    }
    System.out.println(sum);//returns final value
  }
}
