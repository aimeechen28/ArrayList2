
/* Question 3: Adding BigInts

There is a limit to how large number you can store in a primitive variable! For example the largest number you can store 
in an int is 2,147,483,647! But what if you needed to work with astronomically large integers? One way is to represent these 
numbers as a list. For example, the number 9801 can be represented in an ArrayList<Integer> like so: [9,8,0,1]. Let’s call these 
list representations of numbers by the name “BigInts” for the sake of talking about them.

Write a method called add that adds 2 BigInts. They can be arbitrarily long, and may be different lengths. The method should return
a new ArrayList<Integer> that represents the answer of adding the two together.

[9,8,0,1] + [3,4,5,6] = [1,3,2,5,7]
Some things to keep in mind: BigInts can only be positive and will have a size of at least 1 (even the number zero has 1 digit).
Your method should not convert BigInts to ints or doubles or longs or any other primitive value to do the adding because they 
should be able to exceed the maximum values that you can store in a primitive. Typical autoboxing and unboxing of individual digits 
is fine.

 */
import java.util.*;
class Q3{

    public static void main(String[] args){
        ArrayList<Integer> before1 = new ArrayList<Integer>();
        ArrayList<Integer> before2 = new ArrayList<Integer>();
        before1.add(9);
        before1.add(8);
        before1.add(0);
        before1.add(1);
        //---------------------------------
        before2.add(5);
        before2.add(3);
        before2.add(6);
        ArrayList<Integer> after = BigInts(before1, before2);
        System.out.println(after);
        //answer should be 10337;
    }

    public static ArrayList<Integer> BigInts (ArrayList<Integer> first,ArrayList<Integer> second){
        int carry = 0;
        int extra = 0;
        int sum = 0;
        ArrayList<Integer> finall = new ArrayList<Integer>();
        if(first.size()<second.size()){
            extra =second.size() - first.size();
            for(int i = 0;i<extra;i++){
                first.add(i,0);
            }
        }else if(first.size()>second.size()){
            extra =first.size() - second.size();
            for(int i = 0;i<extra;i++){
                second.add(i,0);
            }
        }
        int i = first.size()-1;
        while( i >= 0){
            sum = first.get(i) + second.get(i) + carry;

            if(sum >= 10){
                carry = 1;
                sum -= 10;
                i--;
            }else{
                i--;
            }
            finall.add(0,sum);
        }

        if(carry>0) finall.add(0,1);
        return finall;
    }
}
