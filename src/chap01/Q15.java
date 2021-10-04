package chap01;

import java.util.Scanner;

public class Q15 {
    static void tringleLB(int n) {    //왼쪽 아래가 직각인 이등변 삼각형을 출력
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변 삼각형을 출력
        for(int i=1; i<=n; i++) {
            for(int j=5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void triangleRU(int n) { //오른쪽 위가 직각인 이등변 삼각형을 출력
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=i-1; j++) {
                System.out.printf(" ");
            }
            for(int k=1; k<=n+1-i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
    static void triangleRB(int n ) {    //오른쪽 아래가 직각인 이등변 삼각형을 출력
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("한 변의 길이 : ");
            n = scanner.nextInt();
        } while(n <= 0);

        triangleRB(n);
    }
}
