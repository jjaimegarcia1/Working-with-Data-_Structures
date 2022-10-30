import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Inclass_10_6_StackNODEQUE {
    public static void main(String[] args) {

//        Stack<String> myShopList = new Stack<>();
        Deque<String> myShopList=new ArrayDeque<String>();
        myShopList.push("Apples");
        myShopList.push("Banana");
        myShopList.push("Cake");
        myShopList.push("Donut");

        String top=myShopList.pop();
        System.out.printf("\n top%s ", top);
        System.out.printf("\n size:%s",myShopList.size());
        myShopList.push("Eggs");
        System.out.printf("\n peek Top%s ", myShopList.peek());
        System.out.printf("\n size:%s",myShopList.size());
        showStack(myShopList);

    }

    private static void showStack(Deque<String> myShopList) {
        System.out.printf("\n------------------------");
//        for (String item:myShopList){
//            System.out.printf("\n Item: %s", item); /*** This unfortunately will only produce output in insertion order
        Iterator value = myShopList.iterator();
// Displaying the values
// after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        }
    }
