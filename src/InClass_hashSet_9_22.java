import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class InClass_hashSet_9_22 {
    public static void main(String[]args){
        // HashSet<String>names=new LinkedHashSet<>(); **Fastest Prints out Randonmly NO ORDER
        // LinkedHashSet<String>names=new LinkedHashSet<>(); **Prints out in order entered INSERTION ORDER
        TreeSet<String> names=new TreeSet<>(); //slowest operation ** Prints out alphabetically ALPHABETICAL ORDER
        names.add("Jack");
        names.add("Jill");
        names.add("James");
        names.add("Jackie");
        names.add("Jack"); //would not enter in a duplicate since already entered
        System.out.printf("Size:%s",names.size());
        for(String name:names){
            System.out.printf("\n Name:%s",name);
        }
        names.remove("Jill");//removes jill from the Hash set
        if(names.contains("Jill")){
            System.out.printf("\n Yep shes there");
        }
    }
}
