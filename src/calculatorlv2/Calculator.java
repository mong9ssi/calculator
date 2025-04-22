package calculatorlv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 1. 속성 - 변수 선언으로 표현할 수 있음
    private double double1;
    private double double2;
    private char char1;
    private List<Double> resultList = new ArrayList<>();

    // 2. 생성자
    Calculator() {}

    Calculator(double double1 , double double2){
        this.double1 = double1;
        this.double2 = double2;
    }


    // 3. 기능

//    // 덧셈
//    double sum (double double1 , double double2) {
//        return double1 + double2;
//    }
//    //뺼셈
//    double sub (double double1 , double double2) {
//        return double1 - double2;
//    }
//    //곱셈
//    double mul (double double1 , double double2) {
//        return double1 * double2;
//    }
//    //나눗셈
//    double div (double double1 , double double2) {
//        return double1 / double2;
//    }

    // 사칙연산
    double arithmetic (double double1 , double double2 , char char1) {
        switch (char1) {
            case '+' :
                return double1 + double2;
            case '-' :
                return double1 - double2;
            case '*' :
                return double1 * double2;
            case '/' :
                if (double2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                } else {
                    return double1 / double2;
                }
            default:
                System.out.println("사칙연산(+,-,*,/) 을 입력해주세요");
        }
        return 0;
    }


    //리스트 추가 기능.
    void addresult(double result) {
        resultList.add(result);
    }

    List<Double> getResultList() {
        return resultList;
    }


}
