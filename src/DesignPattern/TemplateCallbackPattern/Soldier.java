package DesignPattern.TemplateCallbackPattern;

public class Soldier {

    //콘텍스트
    void runContext(String weaponSound){
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    //전략을 익명 내부 클래스로 사용
    private Strategy executeWeapon(final String weaponSound){
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }

}
