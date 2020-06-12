package Demo01Interface.MultiExtends;

public interface B {

    public abstract void methodB();

    // 重名的抽象方法
    public abstract void method();

    // 重名的默认方法
    public default void methodDefault(){
        System.out.println("BBB");
    }
}



