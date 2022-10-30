import lib.FileIOV2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OrderManagerTest {
    @Test
    public void creationTest() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        assertEquals(17,17);
    }

    @Test
    public void AddItemToOrderTest() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.AddItemToOrder(9999, 1,444,12);
        OrderManager.showCounts(theCounts2);
        assertEquals(18,18);
    }
    @Test
    public void ChangeQuantityTest(){
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.UpdateQuantity(OrderManager.byOrderId,1235, 1,9);
        OrderManager.showCounts(theCounts2);
        assertTrue(true);

    }
    @Test
    public void ArrayListTest() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        assertEquals(17,17);
    }
    @Test
    public void ChangeStatus(){
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.ChangeStatus(OrderManager.byStatus,999,1,"shipped");
        OrderManager.showCounts(theCounts2);
        assertTrue(true);
    }
    @Test
    public void AllOrdersShipped() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.getOrdersByState("shipped");
        assertTrue(true);
    }
    @Test
    public void AllOrdersNEW() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.getOrdersByState("new");
        assertTrue(true);
    }
    @Test
    public void AllOrdersPizzaHut() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.getOrdersByState("pizzaHut");
        assertFalse(false);
    }
    @Test
    public void FindOrders9999() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.findOrders(9999);
        assertTrue(true);
    }
    @Test
    public void FindOrders1234() {
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
        LinkedHashMap<String, Integer> theCounts2 = OrderManager.CountItems(inLines, field2);
        OrderManager.showCounts(theCounts2);
        OrderManager.findOrders(12358);
        assertFalse(false);
    }

}
