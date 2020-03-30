
/*

方法的重载：
    在同一个类下定义多个方法时，允许它们的名称一样，但是参数列表不一样。调用有重载的方法时，具体调用重载中的哪一个方法，是看实际参数
列表与哪一个形式参数列表相匹配。好处：只需要记住一个方法名称，就可以调用该方法实现多个类似的功能。

(1).构成方法重载的条件：方法名相同，形参列表不同即可构成重载。形参列表不同可分为以下几种情况：
a. 参数个数不同可以构成重载
b. 参数个数相同，但是参数类型不同可以构成重载
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(double a, int b) {
        return a + b;
    }

(2).方法重载与下列因素无关：参数名称、方法的修饰符、返回值类型

 */

public class MethodOverride {

    // 正确重载
    public static void open(){}
    public static void open(int a){}
    public static void open(int a,int b){}
    public static void open(double a,int b){}
    public static void open(int b,double a){}

    // 错误重载
    // public static void open(int i,int j){}
    // static void open(int a,int b){}
    // public static void OPEN(){}    代码正确不会报错，但并不是有效重载

}
