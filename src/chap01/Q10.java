package chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.println("정수 b-a를 연산합니다.");
        System.out.print("정수 a : "); a = stdIn.nextInt();

        while(true) {
            System.out.print("정수 b : "); b = stdIn.nextInt();
            if(b > a)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b-a = " + (b-a));


    }
}
