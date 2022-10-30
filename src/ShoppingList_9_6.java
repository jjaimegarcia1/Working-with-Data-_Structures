import java.util.ArrayList;

public class ShoppingList_9_6 {
    ArrayList<Item> shoppingList = new ArrayList<>();

    public ShoppingList_9_6(ArrayList<Item> shoppingList) {
        this.shoppingList = shoppingList;
    }
    public ShoppingList_9_6(){

    }
    public void addItem(String name, int ct,boolean gotIt) {
        //Change to if item exists then change ct to CT
        int indx = nameIsThere(name);
        if(indx != -1){
            shoppingList.remove(indx);
            Item nItem= new Item(name, ct,gotIt);
            shoppingList.add(nItem);
        }
        else {
            Item item = new Item(name, ct, gotIt);
            shoppingList.add(item);
        }
    }

    public int nameIsThere(String inName) {
        int theItemInx = -1;
        int ct=0;
        for(Item item:shoppingList){
            if(item.getName().equals(inName)){
                theItemInx= ct;
                break;
            }
           ct++;
        }
        return theItemInx;
    }

    public void showList() {
        for ( Item item : shoppingList){
            System.out.printf("\nItem:%s Ct:%s", item.getName(),
                    item.getCt());
        }
    }
    public int getSize(){
        return shoppingList.size();
    }
    public boolean removeItem(String inItem) {
        boolean gotIt = false;
        int ct = 0;
        for ( Item item : shoppingList){
            if ( item.getName().equals(inItem)){
                shoppingList.remove(ct);
                gotIt = true;
                break;
            }
            ct++;
        }
        return gotIt;
    }
    public ArrayList<Item> getItems(boolean gotIt) {
        ArrayList<Item> itemgot = new ArrayList<>();
        for ( Item item : shoppingList) {
            if(item.isGotIt() == gotIt){
                itemgot.add(item);
            }
        }
        return itemgot;
    }
    public boolean renameItem ( String origName, String newName ){
        for ( Item item : shoppingList){
            if(origName.equals(newName)){
                return true;
            }
            else{
                item.setName(newName);
                return false;
            }
        }
        return true;
    }
}
class Item {
    private String name;
    private int ct;
    private boolean gotIt;

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public Item(String name, int ct, boolean gotIt) {
        this.name = name;
        this.ct = ct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCt() {
        return ct;
    }
    public void setCt(int ct) {
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "Item :" +
                "name='" + name + '\'' +
                ", ct=" + ct+ '\'' +
                ", got It=" + gotIt;
    }
}
