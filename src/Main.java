import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("keyString", "valueString");
        myMap.put("keyString2", "valueString2");

        System.out.println(myMap.size());

        String keyString2 = myMap.get("keyString2");
        System.out.println(keyString2);

        String keyString3 = myMap.get("keyString3");
        System.out.println(keyString3);

        myMap.put("keyString2", "valueString3");
        keyString2 = myMap.get("keyString2");
        System.out.println(keyString2);

        myMap.remove("keyString");
        String keyString = myMap.get("keyString");
        System.out.println(keyString);

        boolean mapContains = myMap.containsKey("keyString2");
        System.out.println(mapContains);

        boolean valueContains = myMap.containsKey("valueString");
        System.out.println(valueContains);

        boolean valueContains2 = myMap.containsKey("valueString2");
        System.out.println(valueContains2);

        Map<String, String> mySecondMap = new HashMap<>();

        System.out.println(mySecondMap.size());

        mySecondMap.putAll(myMap);
        System.out.println(mySecondMap.size());

    }
}
