package java_learning.DiGui;

public class qiuhe {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("请输入一个数字");
        int a=s.nextInt();
        System.out.println(sum(a));
    }
    public static int sum(int a){
        if(a==1){
            return 1;
        }else {
            return a + sum(a - 1);
        }

    }

}
