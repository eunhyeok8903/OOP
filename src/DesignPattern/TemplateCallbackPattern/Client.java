package DesignPattern.TemplateCallbackPattern;

public class Client {
    //전략을 익명 내부 클래스로 구현한 전략 패턴
    // Strategy패턴과 다르게 전략을 외부 클래스에서 -> 익명 내부클래스로 구현
    //의존성 주입에 사용하는 특별한 전략 패턴이다.

    public static void main(String[] args){
        Soldier eunhyeok=new Soldier();
        eunhyeok.runContext("총! 총초초총총!");
        System.out.println();
        eunhyeok.runContext("칼! 카칼카카칼!");
        System.out.println();
        eunhyeok.runContext("도끼! 도도도돆독끼!");
    }

}
