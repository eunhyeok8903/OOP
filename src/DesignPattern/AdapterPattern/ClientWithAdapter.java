package DesignPattern.AdapterPattern;

public class ClientWithAdapter {
    //어댑터 패턴을 사용한느 클라이언트
    public static void main(String[] args){
        AdapterServiceA asa = new AdapterServiceA();
        AdapterServiceB asb = new AdapterServiceB();

        //어뎁터 적용
        asa.runService();
        asb.runService();
    }
}
