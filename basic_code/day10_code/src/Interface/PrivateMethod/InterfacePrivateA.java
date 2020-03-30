
/*

    前面学习了接口的默认方法、静态方法，如果两个默认方法(静态方法)中有重复代码的时候，我们需要提取出来一个
公共的方法来封装这部分重复的代码，以此来实现代码复用。但是这个公共方法不应该让实现类或者其他类使用，应该仅
限于本接口内部使用，应该是私有化的。所以从JDK9开始，接口当中可以定义私有方法：

1.普通私有方法，解决多个默认方法之间重复代码问题。格式如下：
                            private 返回值类型 方法名称(参数列表) {
                                      方法体;
                            }

2.静态私有方法，解决多个静态方法之间重复代码问题。格式如下：
                            private static 返回值类型 方法名称(参数列表) {
                                      方法体;
                            }

 */

package Interface.PrivateMethod;

public interface InterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon();
    }

    /*
    将公共代码提取出来封装成一个方法，以此来实现代码复用，但是此方法会被实现类继承下去
    public default void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
     */

    // 将该公共方法定义成普通私有方法，不会被实现类继承下去，仅限于本接口内部使用
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
