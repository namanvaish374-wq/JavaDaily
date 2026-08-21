/*
 * Binary Sum
 *
 * You are given two integers N and K. Determine whether there exists a binary
 * string S of length N that satisfies both conditions:
 *
 * 1. The sum of all digits in S is K.
 *    S[1] + S[2] + ... + S[N] = K
 *
 * 2. No two adjacent digits are equal.
 *    For every i such that 1 <= i < N, S[i] != S[i + 1].
 *
 * Input Format:
 * The first line contains an integer T, the number of test cases.
 * Each test case contains two space-separated integers N and K.
 *
 * Output Format:
 * For each test case, print "YES" if such a binary string exists; otherwise,
 * print "NO".
 */



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        int n, k, t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t--> 0) {
            int x=0;
            n = sc.nextInt();
            k = sc.nextInt();
            if(n%2==0)
            x=n/2;
            else
            x=(n+1)/2;
            
            
            
           int  y=(n/2);
            
            if(x==k || y==k)
            System.out.println("YES");
            else 
            System.out.println("NO");
        }


    }
}