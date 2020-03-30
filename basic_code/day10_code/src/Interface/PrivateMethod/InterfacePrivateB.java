package Interface.PrivateMethod;

public interface InterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodCommon();
    }

    /*
    将公共代码提取出来封装成一个方法，以此来实现代码复用，但是此方法可以在其它类中被调用
    public static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
     */

    // 将该公共方法定义成静态私有方法，仅限于本接口内部使用
    private static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
