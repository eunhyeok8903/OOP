package DesignPattern.AdapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args){
        ServiceA sa = new ServiceA();
        ServiceB sb = new ServiceB();

        //서비스마다 각각 다르게 메서드 호출 해주어야하는 단점
        sa.runServiceA();
        sb.runServiceB();
    }
}
