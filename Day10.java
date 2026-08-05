/*
 * Pep Bidding
 *
 * Pep is known for making accurate bids on football matches. Team A and Team P
 * are playing against each other, and both teams have N players.
 *
 * For every player i (1 <= i <= N):
 * - Team A's player has attack power attA[i] and defense power defA[i].
 * - Team P's player has attack power attP[i] and defense power defP[i].
 *
 * The total attack power of a team is the sum of the attack powers of all its
 * players. Similarly, the total defense power is the sum of the defense powers
 * of all its players.
 *
 * Pep bids for a team only when its total attack power and total defense power
 * are both strictly greater than those of the other team. If neither team meets
 * this condition, Pep bids for a draw.
 *
 * Determine whether Pep bids for Team A, Team P, or a draw.
 */


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t--> 0)
        {
            int s1=0,s2=0,s3=0,s4=0;
            n = sc.nextInt();
            int[] att1 = new int[n];
            int[] att2 = new int[n];
            int[] def1 = new int[n];
            int[] def2 = new int[n];
            for(int i=0;i<n;i++)
            {
                att1[i]=sc.nextInt();
                s1+=att1[i];
            }
            for(int i=0;i<n;i++)
            {
                def1[i]=sc.nextInt();
                s2+=def1[i];
            }
            for(int i=0;i<n;i++)
            {
                att2[i]=sc.nextInt();
                s3+=att2[i];
            }
            for(int i=0;i<n;i++)
            {
                def2[i]=sc.nextInt();
                s4+=def2[i];
            }
            if(s1>s3  &&  s2>s4)
            System.out.println("A");
            else if(s3>s1 && s4>s2)
            System.out.println("P");
            else
            System.out.println("DRAW");
        }
    }
}