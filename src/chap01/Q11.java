package chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int a;
        int no = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요.");

        while(true){
            System.out.print("정수값 : "); a = scanner.nextInt();
            if(a > 0) break;
            System.out.println("0보다 큰 값을 입력하세요.");
        }

        while(a > 0) {
            a /= 10;
            no++;
        }

        System.out.println("입력한 정수의 자릿수 : " + no);
    }
}
