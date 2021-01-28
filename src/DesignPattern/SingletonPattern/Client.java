package DesignPattern.SingletonPattern;

public class Client {
    public static void main(String[] args){
        //private 생성자이므로 new를 통해 인스턴스를 생성할 수 없다.
        //Singleton s = new Singleton();     //불가

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);//s1과 같은 인스턴스
        System.out.println(s3);//s1과 같은 인스턴스

    }
}
