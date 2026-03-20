package java.learning.ForXunhuan;

public class zhishu3 {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            boolean a=true;
            double x=Math.sqrt(i);
            for(int j=2;j<=x;j++){
                if(i%j==0){
                    a=false;
                }
            }
            if(a){
                System.out.println(i+"是质数");
            }
        }
    }
}

