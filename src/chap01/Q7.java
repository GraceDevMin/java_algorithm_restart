package chap01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 덧셈식과 값을 출력합니다.");
        System.out.print("n의 값 : "); int n = stdIn.nextInt();

        int sum = 0;

        for(int i=1;  i <= n; i++) {
            sum += i;
            if(i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = " + sum);
        }
    }

}
