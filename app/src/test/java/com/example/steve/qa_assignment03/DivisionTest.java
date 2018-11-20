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

    @Test
    public void division_isCorrect4() {
        assertEquals(8, 16 / 2);
    }

    @Test
    public void division_isCorrect5() {
        assertEquals(7, 23 / 3);
    }

    @Test
    public void division_isCorrect6() {
        assertEquals(5, 15 / 3);
    }

}