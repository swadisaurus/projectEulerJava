/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=3
 * @Question The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600,851,475,143 ?
 */
public class PE_003
{
  public static void main(String args[])
  {
    long p=600851475143L;//initial the number as a long. Too large for an int.
    long hprime=1;//represents highest prime found
    long test=3;//testing if is a factor of p
    while(p>1)//while p isn't fully factored
    {
      if(p%test==0)//if test is a factor of p
      {
        p/=test;//factor test out
        hprime=test;//test must be highest prime factor
      }
      test+=2;//increment test
    }
    System.out.println(hprime);//return highest prime factor
  }
}
