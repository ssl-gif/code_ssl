
/*

    Random(随机)，是JDK当中提供的一个类，位于 java.util 包路径下，是一个随机数生成器，用来生成随机数字。

(1).构造方法：构造方法无参数

(2).成员方法：
public int nextInt()：生成并返回一个随机的int数字，范围是int所有范围
public String nextInt(int n)：生成并返回一个随机的int数字，范围是左闭右开区间 [0,n)

 */

package RandomClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random r = new Random();

        int num1 = r.nextInt();
        System.out.println("随机数是：" + num1);

        int num2 = r.nextInt(10);
        System.out.println("随机数是：" + num2);

    }
}
