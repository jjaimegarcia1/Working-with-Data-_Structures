import java.util.ArrayList;

public class ShoppingList_9_6JJ {
    //Class for a LIST.
    ArrayList<Item> shoppingList =new ArrayList<>();

    public void addItem(String name, int ct) {
        Item item = new Item(name, ct);
        shoppingList.add(item);
    }
    public void showList() {
        for(Item i : shoppingList)
        System.out.printf("\nItem:%s Ct:%s", i.getName(),i.getCt());
    }

    public boolean removeItem(String inItem) {
        boolean gotIt=false;
        int ct=0;
        for(Item item:shoppingList){
            if(item.getName().equals(inItem)){
                shoppingList.remove(ct);
                gotIt=true;
                break;
            }
            ct++;
        }
        return gotIt;
    }

    private class Item {
        private String name;
        private int ct;

        public Item(String name, int ct) {
            this.name = name;
            this.ct = ct;
        }

        public String getName() {
            return name;
        }

        public int getCt() {
            return ct;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCt(int ct) {
            this.ct = ct;
        }
        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", ct=" + ct +
                    '}';
        }



    }
}
