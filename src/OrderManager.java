import lib.FileIOV2;

import java.util.*;

public class OrderManager {
    static  ArrayList<OrderItem> orders;
    static HashMap<Integer, ArrayList<OrderItem>> byOrderId = new HashMap<>();
    static HashMap<Integer, String> byStatus = new HashMap<>();

    public OrderManager(ArrayList<OrderItem> orders) {
        for (OrderItem o : orders) {
            byOrderId.put(Integer.valueOf(String.valueOf(o)), orders);
            byStatus.put(Integer.valueOf(String.valueOf(o)), String.valueOf(orders));
        }
    }
    public boolean gotThisOrder(int id) {
        boolean gotIt = false;
        if (byOrderId.containsKey(id)) {
            return gotIt;
        }
        return true;
    }

    public static HashSet<ArrayList<OrderItem>> findOrders(int oId) {
        HashSet<ArrayList<OrderItem>> retOrder = new HashSet<>();
        if (byOrderId.containsKey(oId)) {
            retOrder.add(orders);
        }
        else{
            System.out.printf("could not find order");
        }
        return retOrder;
    }

    public static HashMap<String, ArrayList<OrderItem>> getOrdersByState(String inState) {
        HashMap<String, ArrayList<OrderItem>> retOrder = new HashMap<>();
        if (byStatus.containsValue(inState)) {
            retOrder.put(inState, orders);
        }
        return retOrder;
    }

    public static boolean ChangeStatus(HashMap<Integer, String> byOrderId, int orderId, int lineId, String Status ){
        if(byOrderId.containsKey(orderId)&&byStatus.containsValue(lineId)) {
                byStatus.put(orderId,Status);
            } else {
                System.out.printf("No line Id");
                return false;
            }
        return true;
    }
    public static boolean UpdateQuantity(HashMap<Integer,ArrayList<OrderItem>> byOrderId, int orderId, int lineId,int quantity) {
        if (byOrderId.containsKey(orderId) & byOrderId.containsValue(lineId)) {
                byOrderId.put(orderId,orders);
                return true;
        }
        else{
        System.out.printf("Non Existing Order Id");
        }
        return false;
    }
    public static boolean updateThisOrderLineId(HashMap<Integer,ArrayList<OrderItem>> byOrderId, int orderId, int lineId,String Status) {
        if (byOrderId.containsKey(orderId)) {
            if (byOrderId.containsValue(lineId)) {
                byOrderId.put(orderId, orders);
                return true;
            } else {
                System.out.printf("Item has been %s:", Status);
                return false;
            }
        }
        else{
        System.out.printf("Non Existing OrderId");
        }
        return false;
    }

    public static ArrayList<Integer> getAllOrderId(HashMap<Integer,ArrayList<OrderItem>> byOrderId) {
        Set<Integer> keySet = byOrderId.keySet();
        return new ArrayList<>(keySet);
    }

    public static boolean AddItemToOrder(int OrderId, int partNum, int quantity, int lineId) {
        boolean found = false;
        if (byOrderId.containsKey(OrderId)) {
            if (byOrderId.containsKey(partNum)) {
                if (byStatus.containsValue("shipped")) {
                    System.out.printf("item has been shipped");
                } else if (byOrderId.containsKey(partNum)) {
                    orders.add(OrderId, orders.get(quantity + 1));
                    found = true;
                }
            } else {
                orders.add(OrderId, new OrderItem(OrderId, lineId, partNum, quantity, "new", 0));
            }
        }
        return found;
    }
    public static void main(String[] args) {
        String fName = "data/order_status.csv";
        FileIOV2 fio = new FileIOV2(fName);
        ArrayList<String> inLines = null;
        try {
            fio.setFileData();
            inLines = fio.getFileData();
        } catch (Exception e) {
            System.out.printf("\n Cannot open file:%s", fName);
            System.out.printf("\n Msg%s", e.getMessage());
            System.exit(1);
        }
        int field2 = 0;
        LinkedHashMap<String, Integer> theCounts2 = CountItems(inLines, field2);
        showCounts(theCounts2);

        AddItemToOrder(9999, 1,444,12);
        AddItemToOrder(1235, 1,10,12);
        showCounts(theCounts2);

        updateThisOrderLineId(byOrderId,1235,1,"");
        ChangeStatus(byStatus,999,1, "shipped");
        getAllOrderId(byOrderId);

        getOrdersByState("shipped");
        getOrdersByState("new");
        getOrdersByState("PizzaHut");

        findOrders(9999);
        findOrders(112358);


    }
    static void showCounts(LinkedHashMap<String, Integer> theCounts) {
                for(String key:theCounts.keySet()){
                    System.out.println(key);
                }
            }

            static LinkedHashMap<String, Integer> CountItems(ArrayList<String> inLines, int field) {
                LinkedHashMap<String, Integer> theCounts=new LinkedHashMap<>();
                for(String line:inLines){
                    String[] toks= line.split(",");
                    if(field>toks.length-1){
                        throw new IndexOutOfBoundsException("Wow field too big"+field);
                    }
                    String item= toks[field];
                    if(!theCounts.containsKey(item)){
                        theCounts.put(item,1);
                    }
                    else{
                        int ct = theCounts.get(item);
                        ct +=1;
                        theCounts.put(item, ct);
                    }
                }
                return theCounts;
            }

        }