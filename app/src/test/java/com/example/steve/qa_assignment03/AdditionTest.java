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
public class AdditionTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isCorrect1() {
        assertEquals(6, 4 + 2);
    }
    @Test
    public void addition_isCorrect2() {
        assertEquals(15, 7 + 8);
    }
}