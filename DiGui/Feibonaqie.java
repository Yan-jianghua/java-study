package java_learning.DiGui;

public class Feibonaqie {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入月数");
        int x = s.nextInt();
        int y = a(x);
        System.out.println(x + "个月后有"+y+"只兔子");
    }

    public static int a(int x) {
        if (x < 3) {
            return 2;
        } else {
            return ((x - 2) * 2) + a(x - 2);
        }
    }
}