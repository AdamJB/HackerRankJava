package com.ajb.hackerrank.solutions;

import com.ajb.hackerrank.Solution;

import java.util.Scanner;

public class SolveMeSecond {

    private int mT;

    private Scanner mScanner = new Scanner(Solution.getInputStream());

    public SolveMeSecond() {
        mT = mScanner.nextInt();
    }

    public void solve() {
        int sum;
        int a, b;
        for (int i = 0; i < mT; i++) {
            a = mScanner.nextInt();
            b = mScanner.nextInt();
            sum = a + b;
            System.out.println(sum);
        }
    }
}
