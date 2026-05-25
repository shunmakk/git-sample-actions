package com.example2.software_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("テストを開始します");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("テストを終了します");
    }

    @BeforeEach
    void setUp() {
        System.out.println("各テストの実行前");
    }

    @AfterEach
    void tearDown() {
        System.out.println("各テストの実行後");
    }

    @Test
    void testPowerTC3() {
        double actualAnswer = MathUtil.power(0, 0);
        assertEquals(1.0, actualAnswer, "結果が予測と異なります");
    }

    @Test
    void testPowerTC17() {
        double actualAnswer = MathUtil.power(2, -2);
        assertEquals(0.25, actualAnswer, "結果が予想と異なります");
    }

    @Test
    void testPowerTC21() {
        double actualAnswer = MathUtil.power(99, 1);
        assertEquals(99.0, actualAnswer, "結果が予想と異なります");
    }

    @Test
    void testPower22() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(100, 0), "TC22:例外が発生しませんでした");
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC22:期待値と実際の結果が異なります");
    }
}