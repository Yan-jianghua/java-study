package java.learning.Mianxiangduixiang.gouzaofangfa.text1;

public class Student {

    public Student(){
        System.out.println("ssssss");
    }
    private String name;
    private String XueHao;
    private int age;
    private boolean sex;

    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public String getXueHao () {
        return XueHao;
    }

    public void setXueHao (String xueHao){
        XueHao = xueHao;
    }

    public int getAge () {
        return age;
    }

        public void setAge ( int age){
            this.age = age;
        }

        public boolean isSex () {
            return sex;
        }

        public void setSex ( boolean sex){
            this.sex = sex;
        }
    }
