/*Unlock the Next Level
Chef is playing a game.

The next level unlocks when Chef has at least 
X
X experience points (XP). Currently, Chef has 
Y
Y XP.

If the next level is already unlocked, print UNLOCKED.
Otherwise, print how many more XP Chef needs to unlock it. */

//code


import java.util.*;
import java.lang.*;
import java.io.*;

class Day2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<=b)
        System.out.println("UNLOCKED");
        else
        System.out.println(a-b);
	}
}
