package java.learning.Method;

public class Zhishu {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("请输入一个数：");
        int x=s.nextInt();
        if(a(x)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    public static boolean a(int b) {
        boolean c = true;
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                c = false;
            }
        }
        return c;
    }
}