package calculatorlv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");

        // int , char 사전 정의
        double double1 = 0;
        double double2 = 0;
        char char1 = '+';

        //스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 사칙연산 생성자 생성
        Calculator calculator = new Calculator(double1 , double2);


        while (true) {
            //while문 사용 , 음수 입력시 처음으로 반복함 , 0 또는 양수 입력시 반복문 종료
            while (true) {
                System.out.println("원하는 첫번째 숫자를 입력하세요 : ");
                double1 = scanner.nextInt();
                if (double1 < 0) {
                    System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
                } else {
                    System.out.println("첫번째 숫자 : " + double1);
                    break;
                }
            }

            // ㅁ 사칙연산 기호(+,-,*,/) 를 입력받기
            //    ㅁScanner 를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
            //    ㅁ사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. ( charAt(0) )

            // 사칙연산 잘못 입력시 처음으로 반복함 , 제대로 입력시 char 로 치환 후 반복문 종료
            while (true) {
                System.out.println("원하는 사칙연산을 입력하세요 ( + , - , * , / ) : ");
                String string1 = scanner.next();
                if (string1.equals("+") || string1.equals("-") || string1.equals("*") || string1.equals("/")) {
                    char1 = string1.charAt(0);
                    System.out.println("입력한 사칙연산 : " + char1);
                    break;
                } else {
                    System.out.println("잘못 입력했습니다. 사칙연산 기호에 맞게 다시 한번 입력해주세요.");
                }
            }

            while (true) {
                System.out.println("원하는 두번째 숫자를 입력하세요 : ");
                double2 = scanner.nextInt();
                if (double2 < 0) {
                    System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
                } else if (char1 == '/' && double2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다 다시 입력해주세요."); // 0으로 나누는 경우 팝업 발생 후 처음부터 재실행
                } else {
                    System.out.println("두번째 숫자 : " + double2);
                    break;
                }
            }


            // ㅁ 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            //     ㅁ 키워드 : if switch
            //     ㅁ 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
            //     ㅁ 입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
            //     ㅁ 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
            //       ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“

//            if (char1 == '+'){
//                double result = calculator.arithmetic(double1 , double2 , char1);
//                System.out.println("결과 : " + double1 + char1 + double2 + " = " + result);
//                calculatorResult.addresult(result);
//            } else if (char1 == '-') {
//                double result = calculator.arithmetic(double1 , double2 , char1);
//                System.out.println("결과 : " + double1 + " - " + double2 + " = " + result);
//                calculatorResult.addresult(result);
//            } else if (char1 == '*') {
//                double result = calculator.arithmetic(double1 , double2 , char1);
//                System.out.println("결과 : " + double1 + " * " + double2 + " = " + result);
//                calculatorResult.addresult(result);
//            } else if (char1 == '/') {
//                if (double2 != 0) {
//                    double result = calculator.arithmetic(double1 , double2 , char1);
//                    System.out.println("결과 : " + double1 + " / " + double2 + " = " + result);
//                    calculatorResult.addresult(result);
//                } else {
//                    System.out.println("나눗셈 연산에서 분보(두번째 정수)에 0이 입력될 수 없습니다.");
//                }
//            }
            double result = calculator.arithmetic(double1 , double2 , char1); // Scanner 통해 입력받은 값으로 생성자 생성
            System.out.println("결과 : " + double1 + char1 + double2 + " = " + result);

            // 연산 진행 후 계속 진행 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 아무키나 입력시 처음으로)");
            String string1 = scanner.next();
            if (string1.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("처음으로 돌아갑니다.");
            }


        }
    }
}