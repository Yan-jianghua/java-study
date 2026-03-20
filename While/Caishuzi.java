package java.learning.While;

public class Caishuzi {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        boolean b=true;
        while (true){
            System.out.println("请输入你猜的数字");
            int a=s.nextInt();
            if(a==28) {
                System.out.println("ni");
                return;
            }else if(a>28){
                System.out.println("猜大了" );
            } else if (a<28) {
                System.out.println("猜小了");
            }
        }
    }
}
