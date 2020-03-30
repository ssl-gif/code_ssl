package Interface.MultiExtends;

public interface C extends A, B {

    /*
    现在子接口中拥有以下抽象方法：
    public abstract void methodA();
    public abstract void methodB();
    public abstract void method();

    (1).父接口中重名的抽象方法在子接口中并不冲突
    (2).父接口中重名的默认方法必须在子接口中进行覆盖重写
    (实现类对接口默认方法的重写必须要去掉default，但子接口对父接口默认方法的覆盖重写default不能去掉)
     */

    @Override
    public default void methodDefault() {
        System.out.println("CCC");
    }
}


