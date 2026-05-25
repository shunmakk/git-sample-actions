package com.example2.software_test;

public class ExerciseMath {

    public static final int Max_NUM = 13;

    public static int factorial(int n) {


        if (n <= 0) {
            throw new IllegalArgumentException("0以下の値は不正です。");
        }

        if (Max_NUM <= n) {
            throw new IllegalArgumentException("13以上の値は不正です。");
        }

        return getAnswer(n);
    }

    private static int getAnswer(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }
}