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
public class DivisionTest {
    @Test
    public void division_isCorrect() {
        assertEquals(1, 1 / 1);
    }

    @Test
    public void division_isCorrect1() {
        assertEquals(2, 2 / 1);
    }

    @Test
    public void division_isCorrect2() {
        assertEquals(3, 9 / 3);
    }

}