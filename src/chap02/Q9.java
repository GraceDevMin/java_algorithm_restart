package chap02;

import java.util.Scanner;

//그 해 남은 일수 구하기

public class Q9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
    };

    static int isLeap(int year) {
        return (year%4 == 0 && year%100 != 00 || year%400 != 0) ? 1 : 0;    //윤년이면 1, 평년이면 0
    }
    
    //서기 y년 m월 d일의 그 해 경과 일수를 구함
    //변수 i와 days 없이 while문을 이용하여 구현
    static int dayOfYear(int y, int m, int d) {
        while(--m != 0) {
            d += mdays[isLeap(y)][m-1];
        }
        return d;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int days = d;
        for(int i=0; i<m; i++) {
            days += mdays[isLeap(y)][i];
        }
        return 365 + isLeap(y) - days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다");

        do {
            System.out.print("년 : "); int year = scanner.nextInt();
            System.out.print("월 : "); int month = scanner.nextInt();
            System.out.print("일 : "); int day = scanner.nextInt();

            System.out.printf("그 해 %d일 째입니다.\n", dayOfYear(year, month, day));
            System.out.println("올해 남은 일 수는 " + leftDayOfYear(year, month, day) + "입니다.");

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while(retry == 1);


    }
}
