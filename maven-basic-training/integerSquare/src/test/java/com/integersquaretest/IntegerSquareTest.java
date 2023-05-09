package com.integersquaretest;

import com.integersquare.IntegerSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSquareTest {
    @Test
    @DisplayName("Square of the number")
    void squareTest() {
        IntegerSquare integerSquareObj = new IntegerSquare();

        int input = 7;
        double expect = 49;
        double actual = integerSquareObj.squareOfInt(input);

        Assertions.assertEquals(expect, actual);
    }
}
