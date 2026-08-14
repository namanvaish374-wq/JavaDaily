/*
 * Drunk Alcoholic
 *
 * Faizal is upset after learning that he is responsible for Sardar's death.
 * He tries to drown his sorrows in alcohol and becomes very drunk. While
 * walking home, he cannot walk in a straight line.
 *
 * Starting from position 0, Faizal moves as follows:
 *
 * - During the 1st second, he walks 3 steps forward.
 * - During the 2nd second, he walks 1 step backward.
 * - During the 3rd second, he walks 3 steps forward.
 * - During the 4th second, he walks 1 step backward.
 * - This pattern continues alternately.
 *
 * Find Faizal's position relative to his starting point after K seconds.
 */
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int k = sc.nextInt();
            int x = k / 2;

            if (k % 2 == 0)
                System.out.println(x * 3 - (k - x));
            else
                System.out.println((x + 1) * 3 - (k - x)+1);
        }
    }
}