package com.hycat.mathutil.core;

public class MathUtility {
    // class này chứa các hàm tiện ích dùng cho mọi nơi
    // hàm tiện ích dùng cho mọi nơi nghĩa là nó ko lưu lại kết quả xử lí của nó bên trong,
    // vậy nó sẽ được thiết kế là static method

    // n! = 1.2.3...n; trong đó n > 0
    // rule: 0! = 1, 1! = 1, 2! = 2...
    // 20! vừa đủ kiểu long, 18 số 0; 21 giai thừa là overflow
    // ko có âm giai thừa
    // n >= 0 AND n <= 20, ngoài vùng thì invalid
    // 0...20 => valid boundary - vùng giá trị hợp lệ
    // 0, 20 => boundary value - biên giới của tập giá trị
    //  xích qua 1 xíu là sang vùng invalid boundary
    // 0, xích nhẹ sang trái 1 đơn vị, ko tính được
    //    public static long getFactorial(int n) {
    //        if (n < 0 || n > 20) {
    //            throw new IllegalArgumentException("n must be between 0 and 20");
    //        }
    //
    //        // biến trung gian để tính phép nhân
    //        long result = 1;
    //        for (int i = 1; i <= n; i++) {
    //            result *= i;
    //        }
    //        return result;
    //    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");
        if (n == 1 || n == 0) return 1;
        return n * getFactorial(n - 1);
    }
}
