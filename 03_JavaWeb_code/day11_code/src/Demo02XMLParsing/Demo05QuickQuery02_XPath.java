
/*

②.Xpath：XPath即为 XML路径语言，它是一种用来确定XML文档中某部分位置的语言

    a.使用Jsoup的Xpath需要额外导入"JsoupXpath-0.3.2.jar"包
    b.查询w3school参考手册，使用xpath的语法完成查询

 */

package Demo02XMLParsing;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo05QuickQuery02_XPath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02XMLParsing\\student.xml"), "UTF-8");

        // 根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        // 查询所有student标签
        List<JXNode> jxNodes1 = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }

        // 查询所有student标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }

        // 查询student标签下带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }

        // 查询student标签下带有id属性的name标签 并且id属性值为2
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='2']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }

    }
}
