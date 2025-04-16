package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기.
        // ㅁ 양의 정수(0포함)를 입력받기.
        //    ㅁScanner를 사용하여 양의 정수 2개(0포함) 를 전달 받을 수 있습니다.
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

        // boolean 정의
        boolean bool1 = true;
        // 반복문 while 사용해서 bool1 = true 일떄 if 값까지 진행 / false 일데 if else 값 진행
        while (bool1) {
            System.out.println("원하는 첫번째 숫자를 입력하세요 : ");
            int int1 = scanner.nextInt();
            if (int1 < 0) {
                System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
            } else {
                System.out.println("첫번째 숫자 : " + int1);
                break; // 양수일 때 끝냄
            }
        }

        boolean bool2 = true;

        while (bool2) {
            System.out.println("원하는 두번째 숫자를 입력하세요 : ");
            int int2 = scanner.nextInt();
            if (int2 <0 ) {
                System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요."); // 음수일 때 실행
            } else {
                System.out.println("두번째 숫자 : " + int2);
                break; // 양수일 때 끝냄
            }
        }

        // ㅁ 사칙연산 기호(+,-,*,/) 를 입력받기
        //    ㅁScanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        //    ㅁ사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. ( charAt(0) )


        boolean bool3 = true;

        while (bool3) {
            System.out.println("원하는 사칙연산을 입력하세요 ( + , - , * , / ) : ");
            String string1 = scanner.next();
            if(string1.equals("+")|| string1.equals("-")|| string1.equals("*")|| string1.equals("/")) {
                char char1 = string1.charAt(0); // 사칙연산 기호로 저장
                System.out.println("입력한 사칙연산 : " + char1);
                break;
            } else {
                System.out.println("잘못 입력했습니다. 사칙연산 기호에 맞게 다시 한번 입력해주세요.");
            }
        }





    }
}
