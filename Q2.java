
/*
Question 2: Goldbach Conjecture

In 1742, Christian Goldbach conjectured that every even number greater than two could be written as the sum of 
two primes. For example, 16 = 3 + 13. Write a method that takes an even int as a parameter. It then prints to the terminal 
a pair of prime numbers that sum to that int. If there are more than one combination that sums to the number, you just need 
to print ONE possible combination.

For example: 

4 = 2 + 2
6 = 3 + 3
10 = 3 + 7 OR 5 + 5
120 = 7 + 113 OR 11 + 109 OR 13 + 107 OR … 59 + 61 (many possible answers, just print one) 

Use your method from Question 1 to solve this problem. Also, try to do this in one loop rather than a nested loop if you can!

 */
import java.util.*;
class Q2{
    public static void main(String[] args){
        for(int i = 4; i<=100; i= i+2){
        equation(i);

    }
    }

    public static ArrayList<Integer> prime(int n){
        ArrayList<Integer> prm = new ArrayList<Integer>();
        int p = 0;
        for(int i = 2; i<=n;i++){
            prm.add(i);

        }
        //System.out.println("All number:" + prm);
        for(int x = 0; x<prm.size();x++){
            p = prm.get(x);

            for(int y = x+1; y<prm.size(); y++){
                if(prm.get(y)% p == 0){
                    prm.remove(y);
                    y--;
                }

            }
        }
        //System.out.print("Primes: ");
        return prm;

    }

    public static void equation (int n){
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> prm = prime(n);
        for(int i = 0; i<prm.size();i++){
            p1 = prm.get(i);
            p2 = n - p1;
            if(prm.contains(p2)){
                System.out.println( p1 + " + " + p2 + " = " + n); 
                break;
            }else{
                System.out.print("");
            }
        }

    }
}
