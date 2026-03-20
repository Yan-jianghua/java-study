package java.learning.DiGui;

import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int y=s.nextInt();
        System.out.println("阶乘为"+a(y));

    }
    public static int a(int x){
        if(x==1){
            return 1;
        }else{
            return x*a(x-1);
        }
    }
}
