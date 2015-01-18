package com.ajb.hackerrank;

import com.ajb.hackerrank.solutions.FlippingBits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Solution {

    private static String INPUT_FILE_NAME = "input";

    public static void main(String[] args) {
        FlippingBits solve = new FlippingBits();
        solve.solve();
    }

    public static InputStream getInputStream() {
        try {
            return new FileInputStream(System.getProperty("user.dir") + "/" + INPUT_FILE_NAME);
        } catch (FileNotFoundException e) {
            return System.in;
        }
    }
}
