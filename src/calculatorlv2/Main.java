package calculatorlv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");

        // 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기.
        // ㅁ 양의 정수(0포함)를 입력받기.
        //    ㅁScanner 를 사용하여 양의 정수 2개(0포함) 를 전달 받을 수 있습니다.
        //    ㅁ양의 정수는 각각 하나씩 전달 받습니다.
        //    ㅁ양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.


//        //스캐너 생성
//        Scanner scanner = new Scanner(System.in);
//        // 첫번째 숫자 입력하는 부분 ( 양의 정수 0 포함 )
//        System.out.println("원하는 첫번째 숫자를 입력하세요 : ");
//        int int1 = scanner.nextInt();
//        if(int1 < 0) {
//            System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요.");
//        } else {
//            System.out.println("첫번째 숫자 : " + int1);
//        }
//
//        // 두번째 숫자 입력하는 부분 ( 양의 정수 0 포함 )
//        System.out.println("원하는 두번째 숫자를 입력하세요 : ");
//        int int2 = scanner.nextInt();
//        if(int2 < 0) {
//            System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요.");
//        } else {
//            System.out.println("두번째 숫자 : " + int2);
//        }


        //스캐너 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // int , char 정의
            int int1 = 0;
            int int2 = 0;
            char char1 = '+';

            // 반복문 while 사용해서 bool1 = true 일떄 if 값까지 진행 / false 일데 if else 값 진행
            while (true) {
                System.out.println("원하는 첫번째 숫자를 입력하세요 : ");
                int1 = scanner.nextInt();
                if (int1 < 0) {
                    System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
                } else {
                    System.out.println("첫번째 숫자 : " + int1);
                    break; // 양수일 때 끝냄
                }
            }

            while (true) {
                System.out.println("원하는 두번째 숫자를 입력하세요 : ");
                int2 = scanner.nextInt();
                if (int2 < 0) {
                    System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
                } else {
                    System.out.println("두번째 숫자 : " + int2);
                    break; // 양수일 때 끝냄
                }
            }

            // ㅁ 사칙연산 기호(+,-,*,/) 를 입력받기
            //    ㅁScanner 를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
            //    ㅁ사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. ( charAt(0) )

            while (true) {
                System.out.println("원하는 사칙연산을 입력하세요 ( + , - , * , / ) : ");
                String string1 = scanner.next();
                if (string1.equals("+") || string1.equals("-") || string1.equals("*") || string1.equals("/")) {
                    char1 = string1.charAt(0); // 사칙연산 기호로 저장
                    System.out.println("입력한 사칙연산 : " + char1);
                    break;
                } else {
                    System.out.println("잘못 입력했습니다. 사칙연산 기호에 맞게 다시 한번 입력해주세요.");
                }
            }

            // ㅁ 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            //     ㅁ 키워드 : if switch
            //     ㅁ 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
            //     ㅁ 입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
            //     ㅁ 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
            //       ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“

            //   int1 = 첫번째 입력받은 수 // int2 = 두번째 입력받은 수 // char1 = 입력받은 사칙연산

//            if (char1 == '+') {
//                System.out.println("결과 : " + int1 + char1 + int2 + "=" + (int1 + int2));
//            } else if (char1 == '-') {
//                System.out.println("결과 : " + int1 + char1 + int2 + "=" + (int1 - int2));
//            } else if (char1 == '*') {
//                System.out.println("결과 : " + int1 + char1 + int2 + "=" + (int1 * int2));
//            } else if (char1 == '/') {
//                if (int2 != 0) {  // 0으로 나눌 시 경고창 필요로 if문 추가
//                    double double1 = int2; // 나누기 진행 시 소수점 표시 위해 업캐스팅 진행.
//                    System.out.println("결과 : " + int1 + char1 + int2 + "=" + (int1 / double1));
//                } else {
//                    System.out.println("나눗셈 연산에서 분보(두번째 정수)에 0이 입력될 수 없습니다.");
//                }
//            }
            if (char1 == '+') {
                int result = int1 + int2 ;
                System.out.println("결과 : " + result);
            } else if (char1 == '-') {
                int result = int1 - int2 ;
                System.out.println("결과 : " + result);
            } else if (char1 == '*') {
                int result = int1 * int2;
                System.out.println("결과 : " + result);
            } else if (char1 == '/') {
                if (int2 !=0 ) {
                    double double1 = int2;
                    double result = int1 / double1;
                    System.out.println("결과 : " + result);
                } else {
                    System.out.println("나눗셈 연산에서 분보(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }


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