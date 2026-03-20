package java.learning.Mianxiangduixiang.chongwu;

import Mianxiangduixiang.chongwu.ChongWu;

public class ChongwuA {
    public static void main(String[] args) {
        Mianxiangduixiang.chongwu.ChongWu chongwu1=new ChongWu();
        chongwu1.name="张春华";
        chongwu1.sex=false;
        chongwu1.Jiao="汪汪";
        chongwu1.Birthday="2006年12月18日";
        System.out.println("姓名："+chongwu1.name);
        System.out.println("性别："+(chongwu1.sex ?"男":"女"));
        chongwu1.run();
        chongwu1.eat();
    }
}
