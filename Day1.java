package JavaDaily;
/* Array Compression
Chef has an array 
A
A of length 
N
N.

He may repeatedly perform the following operation:

Choose an index 
i
i such that 
A
i
A 
i
​
  is equal to at least one of its adjacent elements, and remove 
A
i
A 
i
​
  from the array.
After each removal, the remaining elements become adjacent.

Determine the minimum possible length of the array that Chef can acheive.
*/


//code


import java.util.Scanner;

public class Day1{
    public static void main(String[] args) {
        // Write your code here
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int ans=1;

        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                ans++;
            }
        }

        System.out.println(ans);
    }

}
