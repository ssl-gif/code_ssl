
/*

(5).字符串的分割相关方法：

public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分，并放入到String[]数组里面返回

#.注意事项：
①.split方法的参数其实是一个“正则表达式”，今后学习
②.如果按照英文句点"."进行切分，必须写"\\."

 */

package StringClass;

public class StringSplit {
    public static void main(String[] args) {

        // 遇见逗号就分割
        String str1 = "aaa bbb ccc";
        String[] array1 = str1.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // 遇见空格就分割
        String str2 = "aaa,bbb,ccc";
        String[] array2 = str2.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array2[i]);
        }

        // 遇见英文句点就分割
        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
