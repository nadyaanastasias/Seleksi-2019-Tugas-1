//Nama : Nadya Anastasia
//NIM : 18217020
//Deskripsi : Web scraping dari granblufantasy wiki, terjadi pergantian tema dikarenakan website yang sebelumnya terlalu banyak foto serta gambar yang classnya susah untuk ditrack karena memiliki nama yang sama

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScraping {
    public static void main(String[] args){
        final String url = "https://gbf.wiki/All_Characters";
        try {
            final Document document = org.jsoup.Jsoup.connect(url).get();
            String title = document.title();
            System.out.println(title);
            System.out.println("Grand Blue Fantasy Character Voice Actor");
            for (Element row : document.select("table.wikitable tr")){

                if (row.select("td:nth-of-type(3)").text().equals("")) {
                    continue;
                }
                else {
                    final String name = row.select("td:nth-of-type(3)").text();
                    final String voice = row.select("td:nth-of-type(12)").text();
                    System.out.println(name+" --> "+voice);
                }
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
