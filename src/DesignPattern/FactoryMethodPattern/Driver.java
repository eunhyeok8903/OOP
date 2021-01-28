package DesignPattern.FactoryMethodPattern;

public class Driver {
    //팩토리 메서드는 객체를 생성 반환하는 메서드다.
    //하위 클래스에서 팩토리 메서드를 오버라이딩하여 객체를 반환하게 하는 것 의미
    public static void main(String[] args){
        //팩터리 메서드를 보유한 객체들 생성
        Animal cat = new Cat();
        Animal dog = new Dog();

        //펙토리 메서드가 반환하는 객체들
        AnimalToy catToy = cat.getToy();
        AnimalToy dogToy = dog.getToy();

        //팩터리 메서드가 반환한 객체들 사용
        catToy.identify();
        dogToy.identify();
    }
}
