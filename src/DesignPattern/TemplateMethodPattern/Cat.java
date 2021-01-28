package DesignPattern.TemplateMethodPattern;

public class Cat extends Animal{

    //상위 클래스 Animal에서 추상 메서드를 만듦 -> 하위 클래스에서 overriding 해주어야함
    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }
}
