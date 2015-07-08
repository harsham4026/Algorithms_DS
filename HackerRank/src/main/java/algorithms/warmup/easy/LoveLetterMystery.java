package algorithms.warmup.easy;

import java.util.Scanner;

/**
 * Created by ashankar1 on 4/9/15.
 */
public class LoveLetterMystery {
    public static void loveLetter(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            String s = in.next();
            int palindromeOp = findPalindrome(s);
            System.out.println(palindromeOp);
        }
    }
    private static int findPalindrome(String s){
        int pal = 0;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                pal+= Math.abs(s.charAt(i) - s.charAt(j));
            }
        }
        return pal;
    }
}

/*
James got hold of a love letter that his friend Harry has written for his girlfriend.
Being the prankster that James is, he decides to meddle with it. He changes all the words in the letter into palindromes.

While modifying the letters of the word, he follows 2 rules:

(a) He always reduces the value of a letter, e.g. he changes 'd' to 'c', but he does not change 'c' to 'd'.
(b) If he has to repeatedly reduce the value of a letter, he can do it until the letter becomes 'a'.
 Once a letter has been changed to 'a', it can no longer be changed.

Each reduction in the value of any letter is counted as a single operation.
Find the minimum number of operations he carries out to convert a given string into a palindrome.


Input Format
The first line contains an integer T, i.e., the number of test cases.
The next T lines will contain a string each.

Output Format
A single line containing the number of minimum operations corresponding to each test case.

Constraints
1 ² T ² 10
1 ² length of string ² 104
All characters are lower cased english letters.

Sample Input #00

3
abc
abcba
abcd
Sample Output #00

2
0
4
Explanation

For the first test case, ab*c* -> ab*b* -> ab*a*.
For the second test case, abcba is a palindromic string.
For the third test case, abc*d* -> abc*c* -> abc*b* -> abc*a* = ab*c*a -> ab*b*a.
 */

//https://www.hackerrank.com/challenges/the-love-letter-mystery