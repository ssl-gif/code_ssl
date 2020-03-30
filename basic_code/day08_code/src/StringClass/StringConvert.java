
/*

(4).字符串的转换相关方法：

public char[] toCharArray()：将当前字符串拆分成为字符数组并返回
public byte[] getBytes()：获得当前字符串底层的字节数组并返回
public String replace(CharSequence oldString, CharSequence newString)：将所有出现的oldString替换成为newString，并返回替换后的字符串

CharSequence是接口，意思是可以接受字符串类型。

 */

package StringClass;

public class StringConvert {
    public static void main(String[] args) {

        // 转换成字符数组
        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 转换成字节数组
        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1); // How do you do? ，原封不动
        System.out.println(str2); // How d* you d*? ，在常量池中创建了一个新的字符串

    }
}
