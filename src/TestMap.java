import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ba", 27);
        hashMap.put("nam", 28);
        hashMap.put("binh", 27);
        hashMap.put("hiep", 27);

        System.out.println("display entries in hashMap: ");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(linkedHashMap);


    }
}