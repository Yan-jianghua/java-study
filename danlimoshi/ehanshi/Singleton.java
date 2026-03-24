package danlimoshi.ehanshi;

public class Singleton {
    private static Singleton s=new Singleton();
    private Singleton(){

    }
    public static Singleton get(){
        return s;
    }
}
