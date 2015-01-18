package com.ajb.hackerrank.solutions;

import com.ajb.hackerrank.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {

    private int mNumLines;
    private ArrayList<Integer> mLines = new ArrayList<Integer>();

    public void solve() {
        readData();
        for (Integer line : mLines) {
            System.out.println(numDivisibles(line));
        }
    }

    private void readData() {
        Scanner in = new Scanner(Solution.getInputStream());
        mLines.clear();
        mNumLines = in.nextInt();
        for (int i = 0; i < mNumLines; i++) {
            mLines.add(in.nextInt());
        }
    }

    private int numDivisibles(Integer fullNumber) {
        int[] digits = digitsOfNumber(fullNumber);
        int count = 0;
        for (int digit : digits) {
            if (digit == 0) {
                continue;
            }
            if ((fullNumber % digit) == 0) {
                count++;
            }
        }
        return count;
    }

    private int[] digitsOfNumber(Integer number) {
        String numString = String.valueOf(number);
        int[] digits = new int[numString.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(numString.charAt(i));
        }
        return digits;
    }
}
