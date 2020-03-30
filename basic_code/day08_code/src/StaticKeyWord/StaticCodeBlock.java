
/*

静态代码块：定义在成员位置，使用static关键字修饰的代码块{  }

                            public class 类名称 {
                                static {
                                    静态代码块内容
                                }
                            }

①.第一次用到本类时，静态代码块执行唯一的一次。
②.静态内容总是优先于非静态，所以静态代码块比构造方法先执行
③.静态代码块的典型内容：用来一次性地对静态成员变量赋初值

 */

package StaticKeyWord;

public class StaticCodeBlock {
    public static void main(String[] args) {

        Student one = new Student(); // 静态代码块执行！    构造方法执行！

        Student two = new Student(); // 构造方法执行！

    }
}
