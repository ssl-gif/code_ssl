
/*

从Java 8开始，接口当中允许定义静态方法。格式如下：

                      public static 返回值类型 方法名称(参数列表) {
                                    方法体;
                      }

(1).接口中的静态方法不会被其实现类所继承下去，所以不能通过接口实现类的对象来调用接口当中的静态方法。
在其他类中，都可以使用接口名来调用静态方法：接口名.静态方法名(参数); 由此可见，接口的静态方法与类的
静态方法类似，都是属于类、接口本身的一个静态方法。

(2).接口中的静态方法必须使用 public static 作为修饰符，其中 public 可省略

 */

package Demo01Interface.Demo03StaticMethod;

public interface InterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口的静态方法！");
    }

}
