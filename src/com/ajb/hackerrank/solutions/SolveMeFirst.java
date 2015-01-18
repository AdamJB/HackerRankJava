package com.ajb.hackerrank.solutions;

import com.ajb.hackerrank.Solution;

import java.util.Scanner;

public class SolveMeFirst {

    public static void solve() {
        Scanner in = new Scanner(Solution.getInputStream());
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

    private static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
