package java_learning.Mianxiangduixiang.fengzhaung;



public class CarA {
    public static void main(String[] args) {
        Car E300=new Car();
        E300.setPinPai("梅赛德斯-奔驰");
        E300.setColor("黑色");
        E300.setJiaGe(40);
        System.out.println("品牌为"+E300.getPinPai());
        System.out.println("颜色为"+E300.getColor());
        System.out.println("价格"+E300.getJiaGe());

    }
}
