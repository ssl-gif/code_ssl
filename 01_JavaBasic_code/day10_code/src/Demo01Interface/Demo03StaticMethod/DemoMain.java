
package Demo01Interface.Demo03StaticMethod;

public class DemoMain {
    public static void main(String[] args) {

        InterfaceStaticImpl one = new InterfaceStaticImpl();
        // impl.methodStatic();  不能使用实现类的对象来调用接口中的静态方法

        // 在其它类中通过接口名称调用静态方法
        InterfaceStatic.methodStatic();

    }
}
