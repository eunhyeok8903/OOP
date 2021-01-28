package DesignPattern.SingletonPattern;

public class Singleton {
    static Singleton singletonObject;//정적 참조 변수

    private void Singleton(){}; //private 생성자를 통해서 new를 통해 생성 불가하게함(하나의 인스턴스 생성 가능해짐)

    //객체 반환 정적 메서드 (인스턴스 하나만 생성 가능하게 하고, 이를 사용할 수 있게 해야함)
    public static Singleton getInstance(){

        if(singletonObject == null){
            singletonObject=new Singleton();
        }

        return singletonObject;
    }
}
