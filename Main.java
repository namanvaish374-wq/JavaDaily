/*
Drawing Chances
Alice and Bob are playing a tournament which consists of 
N
N matches.

Right now, they have completed 
M
M (
1
≤
M
≤
N
1≤M≤N) matches already, and you have the results from those matches. You are given a binary string 
S
S of length 
M
M, where 
S
i
=
1
S 
i
​
 =1 means that Alice won the 
i
i-th match and 
S
i
=
0
S 
i
​
 =0 if Bob won the 
i
i-th match.

At the end, whoever has won more matches wins the tournament. However, if both of them win equal number of matches, the tournament ends in a tie instead.

Given the matches that have already been played, is it still possible for the tournament to end in a tie? Print 
Yes
Yes if it is possible, and 
No
No otherwise.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String s = scanner.next();
            
            int aliceWins = 0;
            int bobWins = 0;
            
            for (int i = 0; i < m; i++) {
                if (s.charAt(i) == '1') {
                    aliceWins++;
                } else {
                    bobWins++;
                }
            }
            
          
            if (n % 2 == 0 && aliceWins <= n / 2 && bobWins <= n / 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
       
    }
}