
/*

    当我们使用一个抽象父类、一个接口时，要做以下几步操作：
第一步：定义一个子类来继承抽象父类、实现接口
第二步：重写抽象父类、接口中的抽象方法
第三步：创建子类对象，调用重写后的方法
    我们的目的只是为了调用子类中重写的方法，那么能不能简化一下，把以上步骤合并成一步呢？
匿名内部类就是这样的快捷方式。其定义格式如下：

            new 抽象父类名称()  {                   new 接口名称() {
              // 覆盖重写所有抽象方法                  // 覆盖重写所有抽象方法
            };                                     };

    如果抽象父类的子类、接口的实现类只需要使用唯一的一次，那么就可以省略掉该子类的定义，
而改为使用匿名内部类。匿名内部类是抽象父类的子类、接口的实现类的简化替代形式，就是在方法
的局部范围内创建一个一次性的匿名的局部内部类，并且这个内部类必须要重写抽象父类、接口中所
有的抽象方法，所以匿名内部类也是局部内部类的一种。

(1).new代表创建了一个对象，所以匿名内部类的本质是"一个实现了抽象父类、接口的匿名子类对象"，

(2).一般会使用抽象父类引用、接口引用来指向匿名内部类的对象，即多态。此时使用多态的方式调用
父类、接口中的方法，就可以访问到匿名内部类重写后的方法。

 */

package InnerClass.AnonymousInnerClass;

public class DemoMain {
    public static void main(String[] args) {

        new Interface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        }.method1(); // 匿名内部类的对象只能使用一次。

        new Interface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        }.method2();

        Interface obj = new Interface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        };
        obj.method1();
        obj.method2();

    }
}
