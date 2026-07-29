/*Largest Odd Substring
You are given a string 
n
u
m
s
nums consisting of digits representing a large integer. Your task is to find the largest-valued odd integer (as a substring of 
n
u
m
s
nums) that can be obtained.

A substring is a contiguous sequence of characters within the string.

Function Declaration
Function Name
f
i
n
d
L
a
r
g
e
s
t
O
d
d
S
u
b
s
t
r
i
n
g
findLargestOddSubstring – This function finds the largest-valued odd integer that can be obtained as a substring of the given numeric string.

Parameters
n
u
m
num : A string representing a large integer, consisting only of digits (
0
–
9
0–9).
Return Value
This function prints:

The largest odd integer substring if it exists.
−
1
−1 if no odd integer substring can be formed.




DIFFICULTY LEVEL -PRACTICE STRINGS */


import java.io.*;
class Day3{



   public static String findLargestOddSubstring(String num) {

    for (int i = num.length() - 1; i >= 0; i--) {
        char ch = num.charAt(i);

        if ((ch - '0') % 2 != 0) {
            return num.substring(0, i + 1);
        }
    }

    return "-1";
  }
}