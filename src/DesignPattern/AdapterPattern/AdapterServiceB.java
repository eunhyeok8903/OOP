package DesignPattern.AdapterPattern;

public class AdapterServiceB {
    //호출 당하는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록 중간에 변환기를 둠

    ServiceB sb = new ServiceB();

    void runService(){
        sb.runServiceB();
    }
}
