package CodingNinjasSolution.Recursion_I.Number_of_Digits;

public class Solution {

    public static int count(int n) {
        //Write your code here
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }
}