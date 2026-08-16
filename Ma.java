/*
 Chef and Dolls
 

Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..*/

import java.util.*;

class Mai{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                ans ^= sc.nextInt();
            }

            System.out.println(ans);
        }
    }
}


