/*Studying Alphabet
Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of N words. Jeff can read a word if it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him! */


//code
import java.util.*;

class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean ok = true;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (s.indexOf(ch) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}