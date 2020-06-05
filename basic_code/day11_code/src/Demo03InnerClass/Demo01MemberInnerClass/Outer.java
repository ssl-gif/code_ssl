package Demo03InnerClass.Demo01MemberInnerClass;

public class Outer {

    int num = 10; // 外部类的成员变量

    public void methodOuter() {
        int num = 40; // 外部类方法的局部变量
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(new Inner().num);
    }

    public class Inner {

        int num = 20; // 内部类的成员变量

        public void methodInner() {
            int num = 30; // 内部类方法的局部变量
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

}
