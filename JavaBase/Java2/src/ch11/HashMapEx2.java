package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 100);
        map.put("허자바", 100);
        map.put("이자바", 80);
        map.put("강자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey() +""+ e.getValue());
        }

        set = map.keySet();
        System.out.println(set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println(total);
    }
}
