package com.hycat;

import com.hycat.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }

    // Test case #4: Check/Verify getFactorial() method with invalid parameter, e.g. n = -5
    // Steps/procedure:
    //  1. Given a valid n, e.g. n = -5
    //  2. Call/invoke getFactorial(n = 6)
    //  3. Execute
    // Expected result:
    //  The method will throw an Exception
    // Status:
    //  PASSED or FAILED
    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
        MathUtility.getFactorial(-5); // PASSED
    }

    // Test case #3: Check/Verify getFactorial() method with valid parameter, e.g. n = 6
    // Steps/procedure:
    //  1. Given a valid n, e.g. n = 6
    //  2. Call/invoke getFactorial(n = 6)
    //  3. Execute
    // Expected result:
    //  The method will return 720 as the result of 6!
    // Status:
    //  PASSED or FAILED
    public static void testFactorialGivenRightArg6RunsWell() {
        System.out.println("6! expected = 720 | actual = " +
                MathUtility.getFactorial(6));
    }

    // Test case #2: Check/Verify getFactorial() method with valid parameter, e.g. n = 5
    // Steps/procedure:
    //  1. Given a valid n, e.g. n = 5
    //  2. Call/invoke getFactorial(n = 5)
    //  3. Execute
    // Expected result:
    //  The method will return 120 as the result of 5!
    // Status:
    //  PASSED or FAILED
    public static void testFactorialGivenRightArg5RunsWell() {
        // input
        int n = 5;
        // expected value
        long expectedValue = 120;

        // call method to get actual value
        long actualValue = MathUtility.getFactorial(n);

        // assertion
        // use boolean or sout
        System.out.println("5! expected: " + expectedValue);
        System.out.println("5! actual: " + actualValue);
    }

    // Test case #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    // Steps/procedure:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 0)
    //  3. Execute
    // Expected result:
    //  The method will return 1 as the result of 0!
    // Status:
    //  PASSED or FAILED
    public static void testFactorialGivenRightArg0RunsWell() {
        // input
        int n = 0;
        // expected value
        long expectedValue = 1;

        // call method to get actual value
        long actualValue = MathUtility.getFactorial(n);

        // assertion
        // use boolean or sout
        System.out.println("0! expected: " + expectedValue);
        System.out.println("0! actual: " + actualValue);
    }
}