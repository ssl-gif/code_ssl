package Demo02XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

// Jsoup入门程序：要先导入"jsoup-1.11.2.jar"包，一般把所有的jar包放在"libs"目录下，然后再右键"Add As Library"将其添加成库
public class Demo00Main {
    public static void main(String[] args) throws IOException {

        // 1.获取Document文档对象
        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02XMLParsing\\student.xml"), "UTF-8");

        // 2.根据Document文档对象来获取Element元素对象
        Elements elements_name = document.getElementsByTag("name");
        Element element01 = elements_name.get(0);

        // 3.获取Element元素对象的文本内容
        String name = element01.text();
        System.out.println(name);

    }
}
