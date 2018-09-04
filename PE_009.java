/*
 * @author swadisaurus
 * @dateStarted 30/08/2018
 * @link https://projecteuler.net/problem=9
 * @Question A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
 public class PE_009
 {
   public static void main(String args[])
   {
     for(int a=1;a<1000;a++)//Try all values for a from 1 to 1000
     {
       for(int b=a;b<1000;b++)//Try all values for b from a to 1000. Does not need to go from 1 because a+b =b+a so there will be repeats
       {
         for(int c=b;c<1000;c++)//Tries all values of c from a to 1000. will not be lower than a or b.
         {
           if((a+b+c==1000)&&(isTrip(a,b,c)))//tries if sum is 1000 and if it is triplet
           {
            System.out.println(a*b*c);//returns final product
            System.exit(0);//There is only 1 triplet so there is no need to try other possibilities
          }
         }
       }
     }
   }
   public static boolean isTrip(int a, int b, int c)//Method to test if three integers are triplets.
   {
    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))//is a^2+b^2=c^2
      return true;//returns true
    else
      return false;//returns false

   }
 }
