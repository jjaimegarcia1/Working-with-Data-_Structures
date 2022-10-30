import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class InClass_9_27_Hash {
    public static void main(String[] args) {
        HashSet<Integer> mynumbs=new HashSet<>();
        HashSet<Double> prices=new HashSet<>();
        HashSet<String> names=new HashSet<>();

        TreeSet<String> myOtherNames=new TreeSet<>();
        LinkedHashSet<String> mylinkers = new LinkedHashSet<>();

        mynumbs.add(22);
        mynumbs.add(44);
        mynumbs.add(1);
        if(mynumbs.contains(44)){
            System.out.printf("\n yes we got 44");
        }
        else{
            System.out.printf("\n No Got.");
        }
        for(int n :mynumbs){
            System.out.printf("\n n:%s",n);
        }
    }
}
