/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=4
 * @Question A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
 public class PE_004
 {
   public static void main(String args[])
   {
     int hPal=0;//stores highest palindrome
     for(int a=100;a<999;a++)//tries all values from 100 to 999
     {
       for(int b=a;b<999;b++)//tried all values from a to 999. Starts from a because if b<a, then the calculation has been done before when a>b.
       {
         if(isPal(a*b) && (a*b)>hPal)//checks if a*b is a palindrome and greater than the previous highest palindrome
         {
           hPal=a*b;//makes a*b the highest if Condition if true
         }
       }
     }
     System.out.println(hPal);//returns final value
   }
   public static boolean isPal(int k)//Takes a string and returns if it is palindromic
   {
     String s=Integer.toString(k);//converts the integer to a string for ease
     for(int i=0;i<s.length()/2;i++)//loops between 1 and half string length
     {
       if(!(s.charAt(i)==(s.charAt(s.length()-1-i))))//compares left side to coresponding right side
       {
         return false;//returns false if they don't match
       }
     }
     return true;//true if they match
   }
 }
