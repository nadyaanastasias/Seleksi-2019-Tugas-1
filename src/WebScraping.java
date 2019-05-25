import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebScraping {
    public ArrayList<Elements> webscrape (String URL) {
        ArrayList<Elements> data = new ArrayList<>();
        try {

            Document doc = Jsoup.connect(URL).get();
            Element table = doc.select("table.wikitable").get(0);//Untuk mendapatkan table yang diinginkan
            Elements rows = table.select("tr");// Mendapatkan row yang diinginkan
            data.add(rows.get(0).select("thead"));// Mendapatkan heading dari table
            for (int j = 1; j < rows.size(); j++) {//Iterasi di table nya
                data.add(rows.get(j).select("td:nth-of-type(3)"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        WebScraping webscrape = new WebScraping();
        ArrayList<Elements> tableData = webscrape.webscrape("https://gbf.wiki/All_Characters");//Url dari website yang dituju
        for (Elements elements : tableData) {
            for (Iterator<Element> iterator = elements.iterator(); iterator
                    .hasNext(); ) {
                Element element = (Element) iterator.next();
                System.out.print(element.text() + "\n");
            }
            System.out.println("\n");
        }

    }
}