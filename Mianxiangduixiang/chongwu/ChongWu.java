package java.learning.Mianxiangduixiang.chongwu;

import java.util.Scanner;

public class ChongWu {
    java.util.Scanner s=new Scanner(System.in);
    String name;
    String Birthday;
    boolean sex;
    String Jiao;
    public void run(){
        System.out.println("请输入跑步的起点：");
        String begin=s.nextLine();
        System.out.println("请输入跑步的终点");
        String Stop=s.nextLine();
        System.out.println(name+"正在跑步");
        System.out.println(name+"已到达"+Stop);

    }
    public void eat(){
        System.out.println("请输入喂食的食物");
        String food=s.nextLine();
        System.out.println(this.name+"正在吃"+food);
        System.out.println(this.name+"进食完毕并"+this.Jiao+"叫啦两声");

    }
}
