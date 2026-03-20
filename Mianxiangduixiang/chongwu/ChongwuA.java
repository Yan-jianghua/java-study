package java_learning.Mianxiangduixiang.chongwu;


public class ChongwuA {
    public static void main(String[] args) {
        ChongWu chongwu1=new ChongWu();
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
