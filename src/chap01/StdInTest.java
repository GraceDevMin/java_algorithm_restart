package chap01;

import java.util.Scanner;

public class StdInTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("next값을 입력하세요");
        String string = stdIn.next();
        System.out.println(string);

        System.out.println("nextLine()값을 입력하세요");
        String lineString = stdIn.nextLine();
        System.out.println(lineString);
    }
}
