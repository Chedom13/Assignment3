package com.example.steve.qa_assignment03;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionTest.class,
        MultiplicationTest.class,
        DivisionTest.class,
        SubtractionTest.class,
})
public class MyTestSuite {
}