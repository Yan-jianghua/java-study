package java.learning.importA;

import java.util.Scanner;
import DiGui.*;
import  static java.lang.System.*;
public class diaoyongdigui {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        out.println("请输入月数：");
        int a=s.nextInt();
        int b=Feibonaqie.a(a);
        System.out.println(b);
        int c=jiecheng.a(2);
        System.out.println(c);
        System.out.println(Math.abs(-22));
    }
}
