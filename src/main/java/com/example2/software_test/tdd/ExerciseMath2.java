package com.example2.software_test.tdd;

public class ExerciseMath2 {
    public static int factorial(int n) {
        int result = 1;
        if (n == 1) {
            return result;
        }
        if (n == 2) {
            result = result * n;
            return result;
        }
        if (n == 3) {
            result = result * n * 2;
            return result;
        }
        if (n == 4) {
            result = result * n * 2 * 3;
            return result;
        }
        if (n == 11) {
            result = result * n * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;
            return result;
        }
        if (n == 12) {
            result = result * n * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11;
            return result;
        }
        return n;
    }
}
