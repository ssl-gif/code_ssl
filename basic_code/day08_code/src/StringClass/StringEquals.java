
/*

(1).字符串的比较相关方法：== 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用以下方法

public boolean equals(Object obj)：与指定字符串进行内容比较
public boolean equalsIgnoreCase(String str)：与指定字符串进行内容比较，忽略大小写

#.注意事项：

①.任何对象传入方法，都能使用Object类进行接收

②.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样

③.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
推荐："abc".equals(str)
不推荐：str.equals("abc")
因为当"str = null"时，前者不会报错，后者会发生对象空指针异常


 */

package StringClass;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        // 凡是写上双引号的字符串常量，都是字符串对象
        System.out.println(str1.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false，严格区分大小写
        System.out.println(str1.equalsIgnoreCase(str4)); // true，忽略大小写

    }
}
