package gss.jsoup.test;

import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class JSoupTest {

	public static void main(String args[]) throws Exception {
		File file = new File("/home/ghu/java/jboss/jbds/hibernate-workspace/sailfish/sailfish-core/src/test/resources/LSC_Websites.html");
		
		Document doc = Jsoup.parse(file, "utf-8", "http://http://www.usaswimming.org/");
		
		Elements links = doc.select("p>a");
		int total=0;
		for(Element e : links) {
			System.out.println("number: "+ (++total)+", data: "+e.data()+", html: "+e.html()+", text: "+e.text()+", outerHtml: "+e.outerHtml()+", val: "+e.val()+", href: "+e.attr("href"));
			
		}
	}
}
