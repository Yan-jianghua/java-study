package danlimoshi.ehanshi;

public class SingletonTest {
    public static void main(String[] args) {
//       Singleton s1=new Singleton();
//        Singleton s2=new Singleton();
//        System.out.println(s1 == s2);
        Singleton s1=Singleton.get();
        Singleton s2=Singleton.get();
        System.out.println(s1==s2);
    }
}
