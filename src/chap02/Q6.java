package chap02;

import java.util.Scanner;

public class Q6 {
    // 정숫값 x를 r진수로 변환하여 배열 d의 아랫자리부터 넣어두고 자릿수를 반환

    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        } while(x != 0);

        for(int i=0; i<digits/2; i++) {
            char temp = d[i];
            d[i] = d[digits-1-i];
            d[digits-1-i] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; //변환하는 정수
        int cd; //기수
        int dno;    //변환 후의 자릿수
        int retry;  //다시 한 번?
        char[] cno = new char[32];  //변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하고자 하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while(no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = scanner.nextInt();
            } while(cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for(int i=0; i<dno; i++) { //2930 -> 101101110010
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while(retry == 1);
    }
}
