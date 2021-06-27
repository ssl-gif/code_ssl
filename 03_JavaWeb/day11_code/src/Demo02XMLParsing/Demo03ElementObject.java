
/*

    Element元素对象：使用Document文档对象获取到Element对象后，就可以使用Element元素对象中的方法来获取标签元素的了。

1.获取子元素对象的方法

    Element getElementById​(String id)：根据id属性值获取唯一的Element元素对象
    Elements getElementsByTag​(String tagName)：根据标签名称获取Element元素对象集合
    Elements getElementsByAttribute​(String key)：根据属性名称获取Element元素对象集合
    Elements getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取Element元素对象集合

2.获取属性值的方法

    String attr(String key)：根据属性名称获取属性值

3.获取文本内容的方法

    String text():获取标签的纯文本内容
    String html():获取标签体的所有内容(包括子标签及其文本内容)

 */

package Demo02XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo03ElementObject {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02XMLParsing\\student.xml"), "UTF-8");
        Element element_student = document.getElementsByTag("student").get(0);

        // 1.获取子元素对象的方法
        Elements elements01 = element_student.getElementsByTag("name");
        System.out.println(elements01.get(0));

        Elements elements02 = element_student.getElementsByAttribute("id");
        System.out.println(elements02.get(0));

        Elements elements03 = element_student.getElementsByAttributeValue("id", "1");
        System.out.println(elements03.get(0));

        // 2.获取属性值的方法
        String number = element_student.attr("number");
        System.out.println(number);

        // 3.获取文本内容的方法
        String text = element_student.text();
        System.out.println(text);

        String html = element_student.html();
        System.out.println(html);

    }
}
