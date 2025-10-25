package com.collections;
import java.util.Scanner;
public class MaximumPermutationValue {
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static long maxPermutationCount(String s) {
        StringBuilder consonants = new StringBuilder();
                for (char ch : s.toCharArray()) {
            if (!isVowel(ch)) {
                consonants.append(ch);
            }
        }
        int n = consonants.length();
                if (n == 0) {
            return 0;
        }
                return factorial(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        String[] inputArray = new String[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }
        long maxPermutationValue = 0;
        for (String s : inputArray) {
            maxPermutationValue = Math.max(maxPermutationValue, maxPermutationCount(s));
        }
        System.out.println( maxPermutationValue);
        scanner.close();
    }
}
