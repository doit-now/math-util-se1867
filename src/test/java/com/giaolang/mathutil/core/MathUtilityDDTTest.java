package com.giaolang.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //@Test LÀ 1 PHẦN ANNOTATION CỦA FRAMEWORK, BIẾN CÁI HÀN CỦA TA THÀNH HÀM MAIN
    //ĐỂ CÓ THỂ RUN. HÀM BT CHỈ CÓ THỂ TRONG MAIN() ĐỂ CHẠY
    //@TEST BIẾN HÀM BẤT KÌ THÀNH MAIN()

    //KĨ THUẬT DDT - DATA DRIVEN TESTING: LÀ KĨ THUẬT TÁCH BỘ DATA KIỂM THỬ RA
    //KHỎI CÁC CÂU LỆNH KIỂM THỬ, MỤC ĐÍCH GIÚP DEVELOPER NHÌN NHANH ĐC XEM
    //BỘ TEST CASE CÒN THIẾU CASE NÀO HAY KO.
    //KĨ THUẬT NÀY CÒN GỌI TÊN KHÁC LÀ THAM SỐ HOÁ BỘ DATA KIỂM THỬ
    //                                PARAMETERIZED TESTING

    //TA LÀM RIÊNG 1 HÀM, PHẢI LÀ STATIC, ĐỂ LƯU BỘ DATA KIỂM THỬ
    public static Object[][] initTestData() {
        return new Object[][]
                       {{0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
                        {6, 720},
                        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException() {
        return new Integer[] {-1, -2, -3, -4, -5, -6, -100, 21, 22, 23, 24, 100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class,
                        () -> MathUtility.getFactorial(n));
    }

}