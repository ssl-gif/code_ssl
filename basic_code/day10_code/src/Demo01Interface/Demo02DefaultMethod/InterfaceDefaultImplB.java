package Demo01Interface.Demo02DefaultMethod;

public class InterfaceDefaultImplB implements InterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }

}