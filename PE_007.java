/*
 * @author swadisaurus
 * @dateStarted 30/09/2018
 * @link https://projecteuler.net/problem=7
 * @Question By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

 public class PE_007
 {
   public static void main(String args[])
     {

     int count=10001-1;//represnts which number prime we are on. We will assume two is prime
     int test=3;//number we are testing to be prime. Already assuming 2 is prime.
     while(count>0)//While the there are remaining primes to be found
     {
       if(isPrime(test))//if test is prime
       {
         count--;//prime is found, subtract from count
       }
       test+=2;//try test+2. We know that test+1 is even and therefore, not prime
     }
     test-=2;
     System.out.println(test);// return final value
   }
   public static boolean isPrime(int n)
   {
     for(int i =3;i<(int)Math.sqrt(n)+1;i+=2)//Test every odd value from 3 to the square root of n. n has no factors greater than sqrt(n)
     {
       if(n%i==0)//if n is divisible by i
       {
         return false;//not prime
       }
     }
     return true;//if hasn't returned false yet, must be true

   }
 }
