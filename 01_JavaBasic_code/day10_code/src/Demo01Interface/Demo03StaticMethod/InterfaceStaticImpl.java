package Demo01Interface.Demo03StaticMethod;

public class InterfaceStaticImpl implements InterfaceStatic {

    // 实现类不会继承接口的静态方法，但是可以使用接口名调用静态方法
    public void methodNormal(){
        InterfaceStatic.methodStatic();
    }

}
