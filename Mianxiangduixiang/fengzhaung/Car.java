package java.learning.Mianxiangduixiang.fengzhaung;

public class Car {
    private String PinPai;
    private String color;
    private int JiaGe;

    public void setJiaGe(int JiaGe) {
        if(JiaGe>50||JiaGe<20){
            System.out.println("不合理");
            return;
        }
        this.JiaGe=JiaGe;
    }

    public String getPinPai() {
        return PinPai;
    }

    public void setPinPai(String pinPai) {
        this.PinPai = pinPai;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getJiaGe() {
        return JiaGe;
    }
}
