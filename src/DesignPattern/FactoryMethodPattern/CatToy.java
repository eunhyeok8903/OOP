package DesignPattern.FactoryMethodPattern;

//팩토리 메서드가 생성할 객체
public class CatToy extends AnimalToy{

    @Override
    public void identify(){
        System.out.println("나는 고양이의 공");
    }
}
