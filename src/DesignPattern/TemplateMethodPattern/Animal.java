package DesignPattern.TemplateMethodPattern;

public abstract class Animal {//추상클래스
    //템플릿 메서드
    public void playWithOwner(){//공통 로직 수행
        System.out.println("귀염둥이 이리온");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    //추상 메서드 (하위 클래스 별로 다르게 분류되어야 하므로 추상 메서드로 선언)
    abstract void play();

    //Hook 메서드 (하위 클래스가 선택적으로 오버라이딩)
    void runSomething(){
        System.out.println("꼬리 살랑 살랑~");
    }
}
