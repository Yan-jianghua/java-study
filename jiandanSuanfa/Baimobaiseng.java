package java.learning.jiandanSuanfa;

public class Baimobaiseng {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            int j=100-i;
            if((i*3+j/3)==100){
                System.out.println("有"+i+"个大"+j+"小");
             }
        }
    }
}
