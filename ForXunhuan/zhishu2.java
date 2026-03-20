package java_learning.ForXunhuan;

public class zhishu2 {
    public static void main(String[] args) {
        int x=1;
        int a=0;
        for(int i=2;i<=100;i++){
            int y=x;
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    x++;
                }
            }
            if(x<=y){
                a++;
                System.out.print(i+"是质数");
                if(a%8==0){
                    System.out.println();
                }
            }
        }
    }
}
