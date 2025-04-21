package calculatorlv2;

public class Calculator {
    // 1. 속성 - 변수 선언으로 표현할 수 있음
    private int int1;
    private int int2;
    private String string1;
    private int result1;

    // 2. 생성자
    Calculator() {}
    Calculator(int int1 , int int2 , String string1) {
        this.int1 = int1;
        this.int2 = int2;
        this.string1 = string1;
    }

    // 3. 기능
    // 덧셈
    int sum (int int1 , int int2) {
        int result = int1 + int2;
        return result;
    }
    //뺼셈
    int sub (int int1 , int int2) {
        int result = int1 - int2;
        return result;
    }
    //곱셈
    int mul (int int1 , int int2) {
        int result = int1 * int2;
        return result;
    }
    //나눗셈
    int div (int int1 , int int2) {
        int result = int1 / int2;
        return result;
    }


}
