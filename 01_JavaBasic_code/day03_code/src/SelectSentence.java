
/*

switch语句的语法格式：

    switch(表达式){
        case 常量值1：
            语句体1;
            break;
        case 常量值2：
            语句体2;
            break;
        ...
        case 常量值n:
            语句体n;
            break;
        default:
        语句体n+1;
        [break;]    // 最后一个break语句可以省略，但是强烈推荐不要省略
    }  //switch语句在此结束

#.注意事项：

①.表达式返回的常量和变量只能是下列数据类型：
基本数据类型：byte/short/int/char
引用数据类型：String字符串(仅限于JDK7以上)、enum枚举

②.case后面的数值不可以重复，若有重复则编译器会报错。

③.case的穿透性：
    如果进入到某个case且其后面不写break，将出现穿透现象，也就是直接按顺序穿透下面所有的case和default语句向后执行，直到遇到break，
或者整体switch结束。(即匹配到哪一个case就从哪一个位置向下按顺序穿透执行，直到遇到了break或者整体结束为止，所以case后面break不能少)

④.switch语句格式可以很灵活：case、default语句的顺序可以颠倒，而且颠倒后不影响和case的匹配，也不影响default是最后默认的执行顺序。

 */

public class SelectSentence {
    public static void main(String[] args) {

        // 根据数字判断输出星期几
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据不合理");
                break;     // 最后一个break语句可以省略，但是强烈推荐不要省略
        }
    }
}
