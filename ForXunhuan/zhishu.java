package java.learning.ForXunhuan;

public class zhishu {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            boolean a=true;
            for(int j=2;j<i;j++){
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
