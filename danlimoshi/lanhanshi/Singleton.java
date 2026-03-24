package danlimoshi.lanhanshi;

public class Singleton {
    private static Singleton s;
    private  Singleton(){

    }
    public static Singleton get(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}
