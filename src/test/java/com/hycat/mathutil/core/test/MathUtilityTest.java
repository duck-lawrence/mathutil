package com.hycat.mathutil.core.test;

import com.hycat.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArg3RunsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell() {
        assertEquals(24, MathUtility.getFactorial(4));
    }

    @Test
    // @Test là ghi chú, đánh dấu, kí hiệu - annotation báo hiệu rằng hàm này là hàm main() có thể run
    // 1 class test có thể có nhiều @Test, vậy 1 class Test có thể có nhều hàm main()
    //  - để ứng với nhiều kịch bản test, nhiều test case khách nhau đều được run
    // Test case #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    // Steps/procedure:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 0)
    //  3. Execute
    // Expected result:
    //  The method will return 1 as the result of 0!
    // Status:
    //  PASSED or FAILED
    public void testFactorialGivenRightArg0RunsWell() {
        // input
        int n = 0;
        // expected value
        long expectedValue = 1;

        // call method to get actual value
        long actualValue = MathUtility.getFactorial(n);

        // assertion
        assertEquals(expectedValue, actualValue);
        assertEquals(1, MathUtility.getFactorial(n));
    }
}