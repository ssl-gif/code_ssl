
/*

    通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用。为类创建对象的过程，叫做实例化一个类，该对象属于类的
一个具体实例，具有类中的所有属性和行为。即我们可以使用该对象访问类中的成员变量和成员方法，以此来获取该对象的属性和行为。

(1).对象的创建格式：    类名称 对象名 = new 类名();

(2).使用对象访问类中的成员：    对象名.成员变量名;  对象名.成员方法名();

 */

package ObjectOriented;

public class ObjectCreationAndUse {
    public static void main(String[] args) {

        // 根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        // 访问成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name); // 赵丽颖
        System.out.println(stu.age);  // 18

        // 访问成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
