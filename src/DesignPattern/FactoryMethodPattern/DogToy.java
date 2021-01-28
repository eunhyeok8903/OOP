package DesignPattern.FactoryMethodPattern;

//팩토리 메서드가 생성할 객체
public class DogToy extends AnimalToy{

    @Override
    void identify(){
        System.out.println("나는 강아지의 공");
    }
}
