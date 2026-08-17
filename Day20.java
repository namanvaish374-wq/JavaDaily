/*
Cars at Maximum Speed
There are 
N
N cars entering a long straight road one after another. Overtaking is not allowed on this road.

You are given the maximum speed of each car in the order they enter the road. Each car tries to move at its maximum speed, but if there is a slower car in front of it, it must reduce its speed to avoid a collision.

A car is considered to be moving at its maximum speed if it does not need to slow down because of any car in front of it.

Find the number of cars that can move at their maximum speed.
 */


import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 1;
            int minSpeed = a[0];

            for (int i = 1; i < n; i++) {
                if (a[i] <= minSpeed) {
                    ans++;
                    minSpeed = a[i];
                }
            }

            System.out.println(ans);
        
    }
}
