
/*

    Document文档对象：使用Jsoup工具类获取到html、xml文档对应的Document对象后，就可以使用Document文档对象中的方法
来获取文档中的标签元素了，即：DOM树中的Element元素对象

Element getElementById​(String id)：根据id属性值获取唯一的Element元素对象

Elements getElementsByTag​(String tagName)：根据标签名称获取Element元素对象集合

Elements getElementsByAttribute​(String key)：根据属性名称获取Element元素对象集合

Elements getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取Element元素对象集合

#.注意：后面三个方法的返回值类型都是Elements类，它的定义如下：public class Elements extends ArrayList<Element>，
所以Elements类是一个"用来存储Element元素对象的ArrayList集合"，可以通过进一步操作这个集合来得到其中的Element元素对象。

 */

package Demo02XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo02DocumentObject {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02XMLParsing\\student.xml"), "UTF-8");

        // 获取id属性为1的标签元素
        Element elementById = document.getElementById("1");
        System.out.println(elementById);

        // 获取标签名称为name的标签元素
        Elements elements01 = document.getElementsByTag("name");
        for (int i = 0; i < elements01.size(); i++) {
            System.out.println(elements01.get(i));
        }

        // 获取属性名称为number的标签元素
        Elements elements02 = document.getElementsByAttribute("number");
        for (int i = 0; i < elements02.size(); i++) {
            System.out.println(elements02.get(i));
        }

        // 获取属性名称、属性值为 "number=heima_0001"的标签元素
        Elements elements03 = document.getElementsByAttributeValue("number", "heima_0001");
        for (int i = 0; i < elements03.size(); i++) {
            System.out.println(elements03.get(i));
        }

    }
}
