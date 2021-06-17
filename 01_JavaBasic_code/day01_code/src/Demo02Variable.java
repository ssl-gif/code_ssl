
/*
变量(Variable)的定义与赋值：
(1).先定义再赋值：   数据类型  变量名称;     变量名称 = 数据值;
(2).定义时赋值：    数据类型  变量名称 = 数据值;

#.注意事项：
①.没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用。
②.在同一个大括号范围内，如果创建多个变量，那么变量的名称不可以相同
③.变量的作用域：从定义变量的一行开始，一直到直接所属的大括号结束为止。变量的使用不能超过其作用域的范围。
④.可以通过一个语句来定义和赋值多个变量，但是一般情况不推荐这么写。例如：int a, b, c; 或 int x = 100, y = 200, z = 300;
⑤.定义long类型变量时，数据值一定要加上后缀L；定义float类型变量时，数据值一定要加上后缀F。如：long num = 300L; float num = 2.5F

 */

public class Demo02Variable {
    public static void main(String[] args) {

        // 法一：先定义再赋值
        int num1;
        num1 = 10;
        System.out.println(num1);

        // 法二：定义时赋值
        int num2 = 25;
        System.out.println(num2);

    }
}