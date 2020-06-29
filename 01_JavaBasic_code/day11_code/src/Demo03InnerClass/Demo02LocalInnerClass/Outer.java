
/*

    如果一个类是定义在方法内部的，那么就是一个局部内部类。"局部"的含义：只有当前方法的
局部范围内才能使用它，出了这个方法就不能用了。定义格式如下：

                        修饰符  class 外部类名称 {

                            修饰符 返回值类型 外部类方法名称(参数列表) {
                                class 局部内部类名称 {
                                    // ...
                                }
                            }

                        }

1.局部内部类的使用：
    由于局部内部类是定义在外部类方法里面的，所以局部内部类只能在这个方法内部使用。在方法
内部创建"局部内部类对象"即可使用。

2.局部内部类的访问权限：
    局部内部类不能使用任何权限修饰符，但是局部内部类里面的成员可以使用四种权限修饰符，并且
里面的成员无论使用何种权限修饰符，都能被方法内部的局部内部类对象访问到。

3.局部内部类的final问题：
    如果局部内部类希望访问到所在方法的局部变量，那么这个局部变量必须是"有效final"的。
("有效final"：局部变量被final修饰、不被final修饰但此变量的值不会再改变)

原因：new出来的局部内部类对象在堆内存当中，局部变量随着方法进栈在栈内存中产生，随着方法
出栈而消失，但是new出来的对象会在堆内存中持续存在，直到被垃圾回收。

*从Java 8+开始，只要局部变量事实不变，那么final关键字可以省略。

 */

package Demo03InnerClass.Demo02LocalInnerClass;

public class Outer { // 外部类

    public void methodOuter() { // 外部类方法

        /*final*/ int num = 10;

        class Inner { // 局部内部类
            public void methodInner() {
                System.out.println("局部内部类的成员方法");
                System.out.println(num);
            }
        }

        // 创建局部内部类对象
        Inner inner = new Inner();
        inner.methodInner();
    }

}