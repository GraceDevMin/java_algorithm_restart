package chap02;

import java.util.Scanner;

public class Q4 {
    static void copy(int[] a, int [] b) {
        for(int i=0; i<a.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a와 b의 요솟수 : ");
        int num = scanner.nextInt();

        int[] a = new int[num];
        for(int i=0; i<a.length; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }
        int[] b = new int[num];
        for(int i=0; i<b.length; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 b의 모든 요소를 배열 a에 복사합니다.");
        copy(a, b);

        for(int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        for(int i=0; i<b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
