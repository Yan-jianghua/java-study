package danlimoshi.lanhanshi;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1=Singleton.get();
        Singleton s2=Singleton.get();
        System.out.println(s1==s2);
    }
}
