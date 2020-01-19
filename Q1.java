import java.util.*;
/*Question 1: Sieve of Eratosthenes 

To find all the prime numbers less than or equal to a given integer n by Eratosthene’s method:

1.Create a list of filled with the ordered sequence of numbers from 2 to n (0 and 1 are not a prime numbers). 
2.Initially, let p equal 2, the first prime number
3.Remove all the multiples of p greater than p. 
4.Find the first number remaining on the list greater than p. This number is the next prime; let p equal this number.
5.Repeat step steps 3 and 4 until p is greater than n.
6.All the remaining numbers in the list are prime.

Create a method that takes n as a parameter and returns a ArrayList<Integer> that contains all the prime numbers less 
than n using the above method. To check your answer, you can google all the prime numbers under common numbers like 
100 or 1000 and see if your method worked correctly.

 */
class Q1{
    public static void main(String[] args){
        ArrayList<Integer> newPrime = prime(100);
        System.out.println(newPrime);
    }

    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer> prm = new ArrayList<Integer>();
        int p = 0;
        for(int i = 2; i<=n;i++){
            prm.add(i);
            
        }
        System.out.println("All number:" + prm);
        for(int x = 0; x<prm.size();x++){
            p = prm.get(x);
            
            for(int y = x+1; y<prm.size(); y++){
                if(prm.get(y)% p == 0){
                    prm.remove(y);
                    y--;
                }
                
            }
        }
        System.out.print("Primes: ");
        return prm;
        //prime under 100 should be 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    }
}
