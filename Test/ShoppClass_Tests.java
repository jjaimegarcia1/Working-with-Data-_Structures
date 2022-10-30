import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShoppClass_Tests {
    @Test
    public void creationTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 12,true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        assertEquals(1, sl.getSize());
    }

    @Test
    public void addRemoveTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, true));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        sl.removeItem("Chicken");
        assertEquals(2, shoppingList.size());
    }
    @Test
    public void nameIsThereTest() {
       ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, true));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        assertEquals(1, sl.nameIsThere("Chicken"));
    }
    @Test
    public void nameIsNotThereTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, true));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        //sl.removeItem("Chicken");
        //    private int nameIsThere(String inName) {
        //int ct= sl.nameIsThere("Chicken");
        assertEquals(-1, sl.nameIsThere("BLAH"));
    }
    @Test
    public void getItemsTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, false));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        sl.getItems(false);
        assertFalse("Chicken",false);
}
    @Test
    public void addItemsTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, false));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        sl.addItem("turkey",2,true);
        sl.showList();
        assertEquals("turkey","turkey");
    }
    @Test
    public void renameItemsTest() {
        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Banana", 2, true));
        shoppingList.add(new Item("Chicken", 4, false));
        shoppingList.add(new Item("Pizza", 6, true));
        ShoppingList_9_6 sl = new ShoppingList_9_6(shoppingList);
        sl.renameItem("Chicken","Ice Cream");
        sl.showList();
        assertEquals("Ice Cream","Ice Cream");
    }
}