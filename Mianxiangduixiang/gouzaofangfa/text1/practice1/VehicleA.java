package java_learning.Mianxiangduixiang.gouzaofangfa.text1.practice1;

import java.util.Scanner;

public class VehicleA {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        java.util.Scanner s=new Scanner(System.in);
        vehicle1.setPinpai("梅赛德斯 奔驰 E300");
        vehicle1.setHeight(1.48);
        vehicle1.setWidth(1.86);
        vehicle1.setLength(5.078);
        vehicle1.start();
        System.out.println("请输入加速度");
        vehicle1.setSpeedUp(s.nextDouble());
        vehicle1.speedUp();
        vehicle1.move();
        System.out.println("请输入减速的加速度");
        vehicle1.setSpeedUp(s.nextDouble());
        vehicle1.speedDown();
        vehicle1.move();

    }

}
