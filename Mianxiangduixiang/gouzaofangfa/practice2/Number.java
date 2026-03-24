package java_learning.Mianxiangduixiang.gouzaofangfa.practic2;

public class Number {
    private int n1;
    private int n2;

    public Number(){

    }
    public Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void add(){

        System.out.println(this.n1+"+"+this.n2+"="+(this.getN1()+this.getN2()));
    }
    public void sub(){
        System.out.println(this.n1+"*"+this.n2+"="+(this.getN1()*this.getN2()));
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
}
