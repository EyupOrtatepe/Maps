package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodStorage {
    public static Map<Integer, String> studentMapCreate() {
       Map<Integer,String > studentMap= new HashMap<>();

        studentMap.put(101,"Ali-Can-11-H-MF");
        studentMap.put(102,"Veli-Cem-10-K-TM");
        studentMap.put(103,"Ali-Cem-11-K-TM");
        studentMap.put(104,"Ayse-Can-10-H-MF");
        studentMap.put(105,"Sevgi-Cem-11-M-TM");
        studentMap.put(106,"Sevgi-Can-10-K-MF");

        return studentMap;
    }



    public static boolean IsimIleOgrenciAra(Map<Integer, String> studentMap, String name) {

        Collection<String> valuesCollection = studentMap.values();

        for (String eachValue : valuesCollection) {

            String[] valueArr= eachValue.split("-");
            String valuedekiIsim= valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(name)){
                return true;
            }
        }


        return false;
    }
}
