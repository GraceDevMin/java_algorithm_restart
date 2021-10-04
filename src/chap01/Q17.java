package chap01;

import java.util.Scanner;

public class Q17 {
    //n단 숫자 피라미드 출력메서드
    static void nspira(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(i%10);
            }
            System.out.println();
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

        nspira(n);
    }
}
