
/*

(2).字符串的获取相关方法：

public int length()：获取当前字符串的字符个数，即字符串长度
public String concat(String str)：将当前字符串的尾部拼接上参数字符串，并返回新的字符串
public char charAt(int index)：获取指定索引位置的单个字符(索引从0开始)
public int indexOf(String str)：查找参数字符串在当前字符串中首次出现的索引位置，如果没有返回-1值

 */

package StringClass;

public class StringGet {
    public static void main(String[] args) {

        // 获取字符串的长度
        int len = "qwertyuiopasdfghjkl".length();
        System.out.println("长度是：" + len);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello，原封不动
        System.out.println(str2); // World，原封不动
        System.out.println(str3); // HelloWorld，在常量池中创建了一个新的字符串

        // 获取指定索引处的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引处的字符是：" + ch);

        // 查找参数字符串在当前字符串中首次出现的索引位置
        int index = "HelloWorldHelloWorld".indexOf("llo");
        System.out.println("首次出现的索引位置是：" + index); // 2
        System.out.println("HelloWorld".indexOf("abc")); // 如果没有返回-1值

    }
}
