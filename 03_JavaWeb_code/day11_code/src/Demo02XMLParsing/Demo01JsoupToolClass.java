
/*

    Jsoup工具类：里面含有很多静态方法，用于将指定的html、xml文档加载进内存形成一颗DOM树，并返回DOM树中的Document文档对象

static Document	parse​(File in, String charsetName)：传递html、xml文件对应的File类对象

static Document	parse​(String html)：传递html、xml文档的字符串

static Document	parse​(URL url, int timeoutMillis)：传递指定网络路径的html、xml文档

 */

package Demo02XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo01JsoupToolClass {
    public static void main(String[] args) throws IOException {

        // 传递html、xml文件对应的File类对象
        Document document01 = Jsoup.parse(new File("day11_code\\src\\Demo02XMLParsing\\student.xml"), "UTF-8");
        System.out.println(document01);

        // 传递html、xml文档的字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name id=\"1\">tom</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name id=\"2\">jack</name>\n" +
                "\t\t<age>20</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document document02 = Jsoup.parse(str);
        System.out.println(document02);

        // 传递指定网络路径的html、xml文档
        URL url = new URL("https://www.baidu.com/");
        Document document03 = Jsoup.parse(url, 10000);
        System.out.println(document03);

    }
}
