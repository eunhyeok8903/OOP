package DesignPattern.ProxyPattern;

public class ClientWithNoProxy {
    //프록시를 사용하지 않은경우
    //직접 호출하게 됨
    public static void main(String[] args){
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
