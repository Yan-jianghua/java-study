package java_learning.Mianxiangduixiang.gouzaofangfa.practice1;

public class Vehicle {
    private String Pinpai;//品牌型号
    private double speed;//速度
    private double length;//车长
    private double width;//车宽
    private double height;//车高
    private double speedUp;
    public Vehicle(){

    }
    public void start(){
        System.out.println("启动中");
        System.out.println("启动成功");
    }

    public void move(){
        System.out.println("正在以"+this.getSpeed()+"km/h的速度移动中");


    }
    public  void speedUp(){
        System.out.println("正在以每次加"+this.getSpeedUp()+"迈的加速度加速中");
        this.setSpeed(this.getSpeed()+this.getSpeedUp());
    }

    public void speedDown(){
        System.out.println("正在以每次减"+this.getSpeedUp()+"迈的加速度加速中");
        this.setSpeed(this.getSpeed()-this.getSpeedUp());

    }

    public double getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(double speedUp) {
        this.speedUp = speedUp;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed<0||speed>200){
            System.out.println("无效速度");
        }
            this.speed = speed;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<1||width>=10){
            System.out.println("无效车宽");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=1||length>=10){
            System.out.println("无效车长");
        }
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<=1||height>=5){
            System.out.println("无效车高");
        }
        this.height = height;
    }

    public String getPinpai() {
        return Pinpai;
    }

    public void setPinpai(String pinpai) {
        Pinpai = pinpai;
    }
}
