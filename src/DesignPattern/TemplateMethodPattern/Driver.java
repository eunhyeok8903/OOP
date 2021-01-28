package DesignPattern.TemplateMethodPattern;

public class Driver {
    //상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 패턴
    public static void main(String[] args){
        Animal bolt = new Dog();
        Animal tom = new Cat();

        bolt.playWithOwner();
        System.out.println('\n');
        tom.playWithOwner();

    }
}
