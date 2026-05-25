package com.example2.software_test.tdd;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class ExerciseMath2Test {

    @Test
    void _1を渡すと1を返す() {
        //準備
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();
        //実行(act)
        int actual = exerciseMath2.factorial(1);
        //検証(Assert)
        assertEquals("期待値と実行結果が異なります", 1, actual);
    }

    @Test
    void _2を渡すと2を返す() {

        ExerciseMath2 exerciseMath2 = new ExerciseMath2();
        int actual = exerciseMath2.factorial(2);
        assertEquals("期待と実行結果が異なります", 2, actual);
    }

    @Test
    void _3を渡すと6を返す() {
        ExerciseMath2 exrciseMath2 = new ExerciseMath2();
        int actual = exrciseMath2.factorial(3);
        assertEquals("期待と実行結果が異なります", 6, actual);
    }

    @Test
    void _4を渡すと24を返す() {


        ExerciseMath2 exrciseMath2 = new ExerciseMath2();
        int actual = exrciseMath2.factorial(4);
        assertEquals("期待と実行結果が異なります", 24, actual);
    }

    @Test
    void _11を渡すと39916800を返す() {
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();
        int actual = exerciseMath2.factorial(11);
        assertEquals("期待と実行結果が異なります", 39916800, actual);
    }

    @Test
    void _12を渡すと479001600を返す() {
        ExerciseMath2 exerciseMath2 = new ExerciseMath2();
        int actual = exerciseMath2.factorial(12);
        assertEquals("期待と実行結果が異なります", 479001600, actual);
    }


}
