
/*

(3).字符串的截取相关方法：

public String subString(int index)：从参数索引位置开始截取，一直到字符串末尾，并返回新的字符串
public String subString(int begin, int end)：从左闭右开区间[begin, end)截取，并返回新的字符串

注意：被截取的字符串并不会改变

 */

package StringClass;

public class StringTruncation {
    public static void main(String[] args) {

        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1); // HelloWorld，原封不动
        System.out.println(str2); // World，在常量池中创建了一个新字符串

        String str3 = str1.substring(2, 5);
        System.out.println(str1); // HelloWorld，原封不动
        System.out.println(str2); // llo，在常量池中创建了一个新字符串

    }
}
