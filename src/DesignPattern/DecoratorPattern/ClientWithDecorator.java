package DesignPattern.DecoratorPattern;

public class ClientWithDecorator {

    //호출된 값을 바로 반환하는 프록시패턴과 다르게
    //메서드 호출의 반환값에 변화를 주기 위해 중간에 장식자를 두는 패턴
    public static void main(String[] args){
        IService decorator= new Decorator();
        System.out.println(decorator.runSomething());
    }
}
