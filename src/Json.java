
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {

    public static void main(String[] args) {
        Document doc = null;
        Map<String, String> fields = new HashMap<String, String>();
        try {
            doc = Jsoup.connect("https://gbf.wiki/All_Characters").get();
            for(Element row : doc.select("table.wikitable tr")){
                if(row.select("td:nth-of-type(1)").text().equals("")){
                    continue;
                }else{
                final String name = row.select("td:nth-of-type(3)").text();
                final String rare = row.select("td:nth-of-type(2)").text();
                fields.put(name,rare);}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(fields);

        System.out.println(json);
    }

}