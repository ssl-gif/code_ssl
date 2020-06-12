
/*

    构造方法是类的一个成员方法。我们使用new Student()创建对象时，new代表在堆内存中创建一个对象，Student()代表此对象调用了类中的
构造方法。构造方法在创建一个对象时被调用，一般用来初始化对象，给对象的成员变量赋初值。定义格式如下：

                                public 类名称 (参数类型 参数名称) {
                                        方法体;
                                }

①.构造方法的名称必须和类名称完全一样，就连大小写也要一样。
②.构造方法可以进行重载，一般使用有参构造方法来初始化对象。
③.如果没有编写任何构造方法，那么编译器将会提供一个默认的隐式无参构造方法。一旦编写了至少一个构造方法，那么编译器提供的默认构造方法将会失效。
④.从有参构造方法可以看出，this关键字可以使用在任何成员方法中，用来解决局部变量和成员变量重名的问题，而不仅仅局限于get、set方法。

 */

package Encapsulation;

public class DemoStudent {
    public static void main(String[] args) {

        // 调用无参构造方法创建对象
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());

        // 调用有参构造方法创建对象
        Student stu2 = new Student("古力娜扎", 22);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }
}
