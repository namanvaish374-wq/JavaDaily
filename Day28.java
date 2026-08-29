import java.util.*;

class Codechef {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T--> 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(gcd(X, Y));
        }

      
    }
}