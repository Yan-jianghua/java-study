package java_learning.Method;

public class Denglu {
    public static void main(String[] args) {
    java.util.Scanner s=new java.util.Scanner(System.in);
    System.out.println("请输入用户名");
    String x=s.nextLine();
    System.out.println("请输入密码");
    String y=s.nextLine();
    System.out.println(a(x,y));
    }

    public static String  a(String b,String c){
        if(b.equals("yanjianghua")){
            if(c.equals("yan060918")){
                return "登陆成功";
            }else{
                return "密码错误";
            }
        }else{
            return "账号错误";
        }
    }
}
