/*Astra Benchmark
GPT-6 Astra is being tested on two tasks.

It scores 
A
A points on coding and 
B
B points on research. To pass the benchmark, the combined score must be at least 
X
X.

Determine whether GPT-6 Astra passes the benchmark.
*/


import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();

        if (A + B >= X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}