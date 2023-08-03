package Gun41._01_JavaLocalDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now();//suanda bulundgun yerın default zamanı verıyor.
        //diğer zonelar için ZoneId yazılır.
        System.out.println("zdt = " + zdt);
         Set<String> ZamanZoneIdleri= ZoneId.getAvailableZoneIds();
            for (String z: ZamanZoneIdleri){
                if (!z.toLowerCase().equals("bul"))
                    continue;
                System.out.println("z = " + z);
            }

            ZoneId zoneIDIstanbul=ZoneId.of("Europe/Istanbul");
            ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIDIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);




    }
}
