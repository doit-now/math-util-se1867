package com.giaolang.mathutil.main;

import static com.giaolang.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //testFactorialGivenRightArgument5RunsWell();
        testFactorialGivenWrongArgumentMinus5ThrowsException();
    }

    //TEST CASE #4:
    //DESCRIPTION: TEST FACTORIAL WITH INVALID ARGUMENT, E.G N = -5
    //STEPS:
    //         CALL GETFACTORAL(-5)
    //EXPECTED RESULT:
    //             AN EXCEPTION IS THROWN - KÌ VỌNG 1 NGOẠI LỆ XH

    //DIỄN GIẢI THÊM: HÀM CỦA TA THIẾT KẾ RẰNG NẾU ĐƯA N ÂM -> HÀM SẼ CHỬI
    //VẬY NẾU TA TEST N ÂM, TA SẼ NHẬN VỀ CHỬI -> HÀM TA CHẠY ĐÚNG NHƯ THIẾT KẾ
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    static void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        getFactorial(-5);
    }

    //VỀ LÝ THUYẾT TA PHẢI TEST VỚI DATA N = 2, 3,.... 20 -> EXHAUSTIVE...
    //TEST CASE #3: TU VIET NOT MO TA
    static void testFactorialGivenRightArgument5RunsWell() {
        System.out.println("5! expected: 120 \n actual: " + getFactorial(5));
    }

    //TEST CASE #2
    //Description: Check getFActorial() method with valid argument (n = 1)

    //Steps/Procedures: (cách test, các bước verify hàm, chức năng)
    //        Call function/ method with n = 1   getFactorial(1)

    //Expected Result: (hy vọng gọi 1! giá trị trả về là mấy
    //          To have 1 as the result of 1!

    //Status (passed/failed-bug): mình phải run hàm và nhìn già trị trả
    //                            về mới biết hàm chạy đúng hay sai
    //       PASSED!!!!!!!!!!!!!!
    //CHẠY TEST CASE/ LÀM CÁC BƯỚC Ở TRÊN ĐỂ XÁC ĐỊNH ĐC HAÀM ĐÚNG SAI
    // -> GỌI LÀ TEST RUN
    static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1; //data đưa vào
        long expectedValue = 1;  //hy vọng 1! = 1
        //long actualValue = MathUtility.getFactorial(n);
        long actualValue = getFactorial(n);
        //SO SÁNH BẰNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
        System.out.println("1! expected: " + expectedValue
                          + "\nactual: " + actualValue);
    }

    //CÁC TEST CASES ĐỂ DƯỚI ĐÂY, LÁT HỒI RUN TRONG MAIN()
    static void testFactorialGivenRightArgument0RunsWell() {
        //TEST CASE #1:
        //Description: Check getFactorial() function with valid argument (n = 0)
        //Steps:
        //       Call function/method with n = 0 getFactorial(0)
        //Expected result:
        //       Get 1 as the result of 0!
        //Actual result/Status (passed, failed) (waiting for test run)
        //

        //TEST RUN: RUN CÁI TEST CASE
        long expectedResult = 1;
        long actualResult = getFactorial(0); //named-argument
        System.out.println("expected value: " + expectedResult
                        + " | actual value: " + actualResult);

    }

}