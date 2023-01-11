package map;

import java.util.HashMap;
import java.util.Map;

public class C03_IsimIleOgrenciAra {

    public static void main(String[] args) {
        Map<Integer,String> studentMap= MapMethodStorage.studentMapCreate();


        boolean result = MapMethodStorage.IsimIleOgrenciAra(studentMap,"Sevgi");
        System.out.println(result);
    }
}
