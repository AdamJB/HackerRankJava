package com.ajb.hackerrank.solutions;

import com.ajb.hackerrank.Solution;

import java.util.Scanner;

public class FlippingBits {

    private int mT;

    private Scanner mScanner = new Scanner(Solution.getInputStream());

    public FlippingBits() {
        mT = mScanner.nextInt();
    }

    public void solve() {
        long unsignedIntMask = 4294967295L;
        for (int i = 0; i < mT; i++) {
            // Read long Digit
            long digit = mScanner.nextLong();

            // Flip Bits
            long flippedDigit = ((digit ^ unsignedIntMask) & unsignedIntMask);
            System.out.println(flippedDigit);
        }
    }
}
