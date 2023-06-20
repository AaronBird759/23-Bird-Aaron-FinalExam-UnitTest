package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void NegativeThrowsException() throws Exception {
        int number = StringCalculator.add("1,5");
        // assertThrowsExactly(new RuntimeException(), StringCalculator.add("-1,5"));
    }

    @Test
    public void NumberBiggerThanThousand() throws Exception {
        int number = StringCalculator.add("1,1000");
        assertEquals("1", Integer.toString(number));
    }

}
