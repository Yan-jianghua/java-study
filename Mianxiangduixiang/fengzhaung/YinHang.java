package java_learning.Mianxiangduixiang.fengzhaung;

public class YinHang {
    private String name;
    private String MiMa;
    private int YuE;
    public String getName(){
        return name;
    }
    public String MiMa(){
        return MiMa;
    }

    public int getYuE() {
        return YuE;
    }

    public void setYuE(int YuE) {
        if(YuE<0){
            System.out.println("不合理");
            return;
        }
        this.YuE = YuE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiMa() {
        return MiMa;
    }

    public void setMiMa(String MiMa) {
        this.MiMa = MiMa;
    }
}
