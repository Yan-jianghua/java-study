package java_learning.Mianxiangduixiang;


public class Student01 {
    public static void main(String[] args) {
        Student i=new Student();
        i.age=20;
        i.gender=false;
        i.name="张春华";
       System.out.println(i.name);
       System.out.println(i.age);
        System.out.println(i.gender ?"男":"女");



        Student j=new Student();
        j.name="闫江桦";
        j.age=20;
        j.gender=true;
        System.out.println(j.name);
        System.out.println(j.age);
        System.out.println(j.gender ?"男":"女");




    }

}
