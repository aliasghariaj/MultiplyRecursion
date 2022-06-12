package com.aj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] array = new int[0];

    public static void main(String[] args) {
        readBuffer();

        System.out.println(multiply(array[0], array[1]));
    }

    //Method that calculate multiply of 2 numbers with recursive function
    private static int multiply(int a, int b) {
        if (b == 0) return 0;

        return a + multiply(a, b - 1);
    }

    private static void readBuffer() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = null;
        try {
            lines = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] strs = lines.trim().split("\\s+");

        array = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.parseInt(strs[i]);
        }
    }
}
