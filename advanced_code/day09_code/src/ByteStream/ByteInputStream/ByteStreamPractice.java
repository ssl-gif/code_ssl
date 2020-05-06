
// 字节流练习：图片文件复制
package ByteStream.ByteInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamPractice {
    public static void main(String[] args) throws IOException {

        // 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day09_code\\test.jpg");

        // 创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("day09_code\\test_copy.jpg");

        // 循环读取字节并写入目的地，完成图片复制
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, length); // 每次只写入有效字节个数
        }

        // 关闭字节流，释放资源。流的关闭原则：先开后关，后开先关
        fos.close();
        fis.close();

    }
}
