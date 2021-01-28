package DesignPattern.ProxyPattern;

public class PService implements IService{

    @Override
    public String runSomething() {
        return "서비스 최고";
    }
}
