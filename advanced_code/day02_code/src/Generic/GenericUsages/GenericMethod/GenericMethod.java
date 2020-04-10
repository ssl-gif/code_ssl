
/*

定义含有泛型的方法格式:

                    修饰符  <泛型>  返回值类型  方法名(泛型类型的参数){
                            方法体;
                    }

含有泛型的方法，在调用方法的时根据方法参数传递指定的数据类型

 */

package Generic.GenericUsages.GenericMethod;

public class GenericMethod {

    // 定义一个含有泛型的方法
    public <E> void method01(E e) {
        System.out.println(e);
    }

    // 定义一个含有泛型的静态方法
    public static <E> void method02(E e) {
        System.out.println(e);
    }

}
