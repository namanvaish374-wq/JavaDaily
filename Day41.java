import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // dp[i][s] = number of increasing subsequences
        // ending at index i with sum s
        long[][] dp = new long[n][K + 1];

        for (int i = 0; i < n; i++) {
            if (a[i] <= K) {
                dp[i][a[i]] = 1; // subsequence containing only a[i]
            }

            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    for (int s = 0; s + a[i] <= K; s++) {
                        dp[i][s + a[i]] += dp[j][s];
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i][K];
        }

        System.out.println(ans);
    }
}Da