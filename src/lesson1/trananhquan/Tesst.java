package lesson1.trananhquan;

public class Tesst {
    public static void main(String[] args) {
        f(1);
    }

    public static void f(int n) {
        if (n>9) {
            return;
        }
        System.out.println("start: " + n);
        f(n+1);
        System.out.println("end: " + n);
    }
}
