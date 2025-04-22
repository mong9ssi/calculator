package calculatorlv2;

public class Calculator {

    // 1. 속성 - 변수 선언으로 표현할 수 있음
    private double double1;
    private double double2;
    private char char1;

    // 2. 생성자
    // 기본 사칙연산 생성자.
    public Calculator(double double1 , double double2){
        this.double1 = double1;
        this.double2 = double2;
    }

    // 3. 기능
    // 사칙연산
    public double arithmetic (double double1 , double double2 , char char1) {
        switch (char1) {
            case '+':
                return double1 + double2;
            case '-':
                return double1 - double2;
            case '*':
                return double1 * double2;
            case '/':
                return double1 / double2;
        } return 0;
    }
}
