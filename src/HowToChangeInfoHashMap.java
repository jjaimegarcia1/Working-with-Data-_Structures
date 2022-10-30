import java.util.*;

public class HowToChangeInfoHashMap {
    public static void main(String[] args) {
        Deque<String> myD=new ArrayDeque<>();
        Deque<String> myD2=new LinkedList<>();
        HashMap<String, ArrayList<Auto>>autos=new HashMap<>();
        Auto newAuto= new Auto("","","","","");
        String deleteThese="Red";
        String a="Chevy";
        if(autos.containsKey(a)){
            ArrayList<Auto> chevies=autos.get(a);
            ArrayList<Auto> newChevies= deleteThisColor(deleteThese,chevies);
            autos.put(a,newChevies);
        }
        //add new Chevy
        if(autos.containsKey(a)){
            ArrayList<Auto>chevies=autos.get(a);
            chevies.add(newAuto);
            autos.put(a,chevies);
        }
    }

    private static ArrayList<Auto> deleteThisColor(String deleteThese, ArrayList<Auto> chevies) {
        return chevies;
    }
}
