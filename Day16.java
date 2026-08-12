/*
 * Tekken
 *
 * The ultimate battle has begun in Tekken. Each fight involves two players.
 * If their current health values are X and Y, then after the fight both
 * players lose min(X, Y) health points.
 *
 * Anna, Bob, and Claudio start with health values A, B, and C respectively.
 * Every pair of players fights exactly once:
 *
 * - Anna vs Bob
 * - Anna vs Claudio
 * - Bob vs Claudio
 *
 * You may choose the order of these three fights. Determine whether it is
 * possible for Anna to have a strictly positive health value after all fights
 * are completed.
 */




import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t,a,b,c;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- > 0){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int x=Math.min(c,b);
            b=b-x;
            c=c-x;
            int y=Math.max(b,c);
            if(a>y)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}
}
