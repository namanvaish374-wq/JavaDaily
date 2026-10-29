import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            int initial = 0;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] == A[i + 1]) initial++;
            }

            int[] leftGain = new int[N];
            int[] rightGain = new int[N];

            // Effect of left boundary
            leftGain[0] = 0;
            for (int L = 1; L < N; L++) {
                int before = (A[L - 1] == A[L]) ? 1 : 0;
                int after = (A[L - 1] == A[L] + 1) ? 1 : 0;
                leftGain[L] = after - before;
            }

            // Effect of right boundary
            rightGain[N - 1] = 0;
            for (int R = 0; R < N - 1; R++) {
                int before = (A[R] == A[R + 1]) ? 1 : 0;
                int after = (A[R] + 1 == A[R + 1]) ? 1 : 0;
                rightGain[R] = after - before;
            }

            int[] suffixMax = new int[N + 1];
            suffixMax[N] = Integer.MIN_VALUE;

            suffixMax[N - 1] = rightGain[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                suffixMax[i] = Math.max(rightGain[i], suffixMax[i + 1]);
            }

            int best = Integer.MIN_VALUE;
            for (int L = 0; L < N; L++) {
                best = Math.max(best, leftGain[L] + suffixMax[L]);
            }

            System.out.println(initial + best);
        }

        sc.close();
    }
}D