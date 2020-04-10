package Generic.GenericUsages.GenericMethod;

public class DemoMain {
    public static void main(String[] args) {

        GenericMethod gm = new GenericMethod();
        gm.method01("abc"); // 指定String类型为泛型
        gm.method01(10);    // 指定Integer类型为泛型 (因为泛型只能是引用类型，所以数值被当成包装类型)

        // 静态方法
        GenericMethod.method02(1);
        GenericMethod.method02("qwert");

    }
}
