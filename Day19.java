import java.util.Scanner;

public /*
CodeChef Streak
CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.

Om and Addy actively maintain their streaks on CodeChef. Over a span of 
N
N consecutive days, you have observed the count of problems solved by each of them.

Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak. */


public class Ma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] om = new int[n];
            int[] addy = new int[n];

            for (int i = 0; i < n; i++) {
                om[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                addy[i] = scanner.nextInt();
            }

            // Your code goes here
            int omCurr = 0, omMax = 0;
            for (int i = 0; i < n; i++) {
                if (om[i] > 0) {
                    omCurr++;
                    omMax = Math.max(omMax, omCurr);
                } else {
                    omCurr = 0;
                }
            }

            int addyCurr = 0, addyMax = 0;
            for (int i = 0; i < n; i++) {
                if (addy[i] > 0) {
                    addyCurr++;
                    addyMax = Math.max(addyMax, addyCurr);
                } else {
                    addyCurr = 0;
                }
            }

            if (omMax > addyMax) {
                System.out.println("Om");
            } else if (addyMax > omMax) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }
    }
} {
    
}
