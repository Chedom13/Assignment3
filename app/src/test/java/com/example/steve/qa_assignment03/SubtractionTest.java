package com.example.steve.qa_assignment03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SubtractionTest {
    @Test
    public void subtraction_isCorrect() {
        assertEquals(4, 6 - 2);
    }

    @Test
    public void subtraction_isCorrect1() {
        assertEquals(8, 18 - 10);
    }
    @Test
    public void subtraction_isCorrect2() {
        assertEquals(7, 7- 0);
    }

}