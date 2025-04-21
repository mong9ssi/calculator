package calculatorlv2;

public class Calculator {
    // 1. 속성 - 변수 선언으로 표현할 수 있음
    private int int1;
    private int int2;
    private double double1;
    private String string1;
    private int result1;

    // 2. 생성자
    Calculator(int int1 , int int2){
        this.int1 = int1;
        this.int2 = int2;
    }
    Calculator(int int1 , double double1) {
        this.int1 = int1;
        this.double1 = double1;
    }
    Calculator(int int1 , int int2 , String string1) {
        this.int1 = int1;
        this.int2 = int2;
        this.string1 = string1;
    }

    public Calculator(int mainInt1, int mainInt2, char mainChar1) {
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
    double div (int int1 , double double1) {
        double result = int1 / double1;
        return result;
    }


}
