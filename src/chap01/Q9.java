package chap01;

import java.util.Scanner;

public class Q9 {
    static int sumof(int a, int b) {
        int max = a;
        int min = b;
        int sum = 0;

        if(b > max) {
            max = b;
            min = a;
        }

        for(; min<=max; min++){
            sum += min;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a부터 b를 포함한 그 사이의 모든 정수의 합을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("a부터 b까지의 합 : " + sumof(a,b));
    }

}
