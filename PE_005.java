/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=5
 * @Question 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
 public class PE_005
 {
   public static void main(String args[])
   {
     int test=22;//Number to be tested
     while(!(isDiv(test)))//while isn't divisible by all numbers from 1-20
     {
       test+=2;//try next value of test. must be multiple of two, so increment by 2.
     }
     System.out.println(test);//return final value
   }
   public static boolean isDiv(int k)
   {
     //20,19,18,17,16,15,14,13,12,11 are the only numbers that need to be check. 1-10 are all factors of these numbers
     for(int i=20;i>10;i--)//loop from 20-11.
      if(k%i!=0)//if k is not a factor of a 11<=x<=20
        return false;//return false; not divisible by all number 1-20
    return true;//if hasn't been false, must be true
   }
 }
