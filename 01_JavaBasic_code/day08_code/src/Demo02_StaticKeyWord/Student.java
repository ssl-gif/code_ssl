package Demo02_StaticKeyWord;

public class Student {

    static {
        System.out.println("静态代码块执行！");
    }

    public Student() {
        System.out.println("构造方法执行！");
    }
}
