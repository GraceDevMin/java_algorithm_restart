package chap01;

import java.util.Scanner;

public class Q16 {
    //n단 피라미드 출력메서드
    static void spira(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(
            );
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n단의 피라미드를 출력합니다.");

        do {
            System.out.print("n단 : ");
            n = scanner.nextInt();
        } while(n <= 0);

        spira(n);
    }
}
