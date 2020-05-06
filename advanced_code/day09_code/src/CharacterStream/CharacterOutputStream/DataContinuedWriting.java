
/*

(1).数据的追加续写：

    每次运行程序，创建文件字节输出流对象时无论文件是否存在都会创建一个新的文件，若文件已存在则会被覆盖掉。如果要向某个已存在的文件
中追加续写一些内容，就要使用以下构造方法来创建FileOutputStream对象。

        FileWriter(String name, boolean append)：创建一个向 "具有指定名称的文件" 中写入数据的文件字符输出流
        FileWriter(File file, boolean append)：创建一个向 "指定File对象表示的文件" 中写入数据的文件字符输出流

boolean append参数相当于是 "追加写的开关"。true：创建对象不会覆盖源文件，继续在文件的末尾追加写数据；false：创建一个新文件，覆盖源文件

(2).写换行符号到文件中：将换行符号写入文件中，形成换行

windows：\r\n
linux：/n
mac：/r

由于write()方法只能接收字节数组、int类型的整数，所以换行符号也要先转换成字节数组再写入

 */

package CharacterStream.CharacterOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class DataContinuedWriting {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("09_IOAndProperties\\f.txt");
        char[] cs = {'a','b','c','d','e'};
        //void write(char[] cbuf)写入字符数组。
        fw.write(cs);//abcde

        //void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(cs,1,3);//bcd

        //void write(String str)写入字符串。
        fw.write("传智播客");//传智播客

        //void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("黑马程序员",2,3);//程序员

        fw.close();

    }
}
