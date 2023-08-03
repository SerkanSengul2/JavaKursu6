package Gun24JavaMap;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulaması 2 kişi için yapınız

        Map<String, String> ugurKartvizit = new HashMap<>();
        ugurKartvizit.put("isim", "uğur yılmaz");
        ugurKartvizit.put("email", "ugur@gmail.com");
        ugurKartvizit.put("adres", "çekmeköy/istanbul");
        ugurKartvizit.put("telefon", "0505676775");

        System.out.println("ugurKartvizit.get(isim) = " + ugurKartvizit.get("isim"));
        System.out.println("ugurKartvizit.get(email) = " + ugurKartvizit.get("email"));

        Map<String, String> zaferkartVizit = new HashMap<>();
        zaferkartVizit.put("isim", "zafer canlı");
        zaferkartVizit.put("email", "zafer@gmail.com");
        zaferkartVizit.put("adres", "ümraniye/istanbul");
        zaferkartVizit.put("telefon", "05556326775");

        Map<String, Map<String, String>> kartvizitler = new HashMap<>();
        kartvizitler.put("uğur", ugurKartvizit);
        kartvizitler.put("zafer", zaferkartVizit);
        System.out.println(kartvizitler.get("zafer").get("isim"));

        for (Map.Entry<String, Map<String, String>> kv : kartvizitler.entrySet()) {
            System.out.println("emailler=" + kv.getValue().get("email"));
        }


    }
}
