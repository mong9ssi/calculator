package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기.
        // ㅁ 양의 정수(0포함)를 입력받기.
        //    ㅁScanner를 사용하여 양의 정수 2개(0포함) 를 전달 받을 수 있습니다.
        Scanner scanner = new Scanner(System.in);

        // 첫번째 숫자 입력하는 부분 ( 양의 정수 0 포함 )
        System.out.println("원하는 첫번째 숫자를 입력하세요 : ");
        int int1 = scanner.nextInt();
        if(int1 < 0) {
            System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요.");
        } else {
            System.out.println("첫번째 숫자 : " + int1);
        }

        // 두번째 숫자 입력하는 부분 ( 양의 정수 0 포함 )
        System.out.println("원하는 두번째 숫자를 입력하세요 : ");
        int int2 = scanner.nextInt();
        if(int2 < 0) {
            System.out.println("음수를 입력했습니다. 양수(0포함)를 입력해주세요.");
        } else {
            System.out.println("두번째 숫자 : " + int2);
        }





    }
}
