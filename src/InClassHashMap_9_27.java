import java.util.TreeMap;
import java.util.Set;

public class InClassHashMap_9_27 { //Changed all Hash Maps with Linked Hash Map with ctrl R, change all
    public static void main(String[] args) {
        TreeMap<String,Double> prices=new TreeMap<>();
        prices.put("Apples",16.99);
        prices.put("Bananas",12.99);
        prices.put("Hot Dogs",15.99);

        if(prices.containsKey("Apples")){
            System.out.printf("Yes we have Apples at %s",prices.get("Apples"));
        }
        else{
            System.out.printf("\n No Got Apples");
        }
        Set<String> myKeys = prices.keySet();
        for (String key: prices.keySet()){
            Double price = prices.get(key);
            System.out.printf("\nItem:%s price:%s", key,price);
        }
        //Price increase on Bananas
        Double p = prices.get("Bananas");
        p= p +3;
        prices.put("Bananas",p);
        for (String key: prices.keySet()){
            Double price = prices.get(key);
            System.out.printf("\nItem:%s price:%s", key,price);
        }
        TreeMap<Integer, String> parts = new TreeMap<>();
        parts.put(1234,"Hammer");
        parts.put(3333,"Saw");
    }
}
