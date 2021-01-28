package DesignPattern.StrategyPattern;

public class Client {
    //클라이언트가 전략을 생성해 전략을 실행할 컨텍스트를 주입하는 패턴
    //Repository를 만들고 Service에 주입해서 사용
    public static void main(String[] args){
        Strategy strategy=null;
        Soldier eunhyeok = new Soldier();

        //strategy전달을 통한 전투 수행
        strategy = new StrategyGun();
        eunhyeok.runContext(strategy);

        System.out.println();

        strategy = new StrategySword();
        eunhyeok.runContext(strategy);

        System.out.println();

        strategy = new StrategyBow();
        eunhyeok.runContext(strategy);
    }
}
