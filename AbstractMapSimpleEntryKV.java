package pkgabstract.map.simpleentry.k.v;

import java.util.AbstractMap;

public class AbstractMapSimpleEntryKV {
    public static void main(String[] args) {
        
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("Key1", 42);

     
        String key = entry.getKey();
        Integer value = entry.getValue();

       
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}
