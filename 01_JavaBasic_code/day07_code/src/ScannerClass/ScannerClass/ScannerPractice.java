
// 练习：键盘录入三个数据并获取最大值

package ScannerClass.ScannerClass;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        int max = a > b ? a : b;
        max = c > max ? c : max;

        System.out.println("最大值是：" + max);
    }
}
