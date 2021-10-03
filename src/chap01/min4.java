package chap01;

public class min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min4(-1,0,100,-100)=" + min4(-1,0,100,-100));
    }
}
