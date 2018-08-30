/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=6
 * @Question The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
 public class PE_006
 {
   public static void main(String args[])
   {
     int sumOfSquares=0;
     int squareOfSum=0;
     int n=100;//nth natural numbers
     for(int i=1;i<=n;i++)//loop from 1 to n
     {
       sumOfSquares+=(int)Math.pow(i,2);//add sum of i^2
       squareOfSum+=i;//add numbers for now, squared after all numbers are added
     }
     System.out.println((int)Math.pow(squareOfSum,2)-sumOfSquares);//square squareOfSum and subtract sumOfSquares
   }
 }
