import java.util.ArrayList;

public class InClass9_6 {
    public static void main(String[] args) {
        //*Strings and String Builder*
//        String name = "D";
//        name+= "B";
//        StringBuilder nameSB = new StringBuilder("D");
//        nameSB.append("B");
//        nameSB.append(99);
//        System.out.printf("\nName:%s NameSB:%s", name, nameSB.toString());

//        String name ="D";
//        int n = 10000;
//        appendtoString(n,name);
//
//        String name2 ="D";
//        appendtoStringBuilder(n,name2);
//    }
////Compares the time it takes to append String vs String Builder.
////Performance Test
//    private static void appendtoString(int n, String name) {
//        long startTime=System.currentTimeMillis();
//        for(int i =0; i<n; i++){
//            name+="A";
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.printf("\nString N:%s time:%s",n,endTime-startTime);
//    }
//    private static void appendtoStringBuilder(int n, String name) {
//        long startTime=System.currentTimeMillis();
//        StringBuilder sb= new StringBuilder(name);
//        for(int i =0; i<n; i++){
//            sb.append("A");
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.printf("\nSB N:%s time:%s",n,endTime-startTime);
        ArrayList<Integer> myList = new ArrayList<>(100);
        myList.add(99);
        myList.add(100);
        myList.add(99);
        showAver(myList);

        int second=myList.get(1);
        for(int i=0; i<myList.size();i++){
            System.out.printf("\n item:%s", myList.get(i));
        }
    }

    private static void showAver(ArrayList<Integer> myList) {
        Integer sum =0;
        for(Integer item:myList){
            sum+=item;
        }
        double aver=0;
        if(myList.size() !=0){
             aver = (double) sum/ myList.size();

        }
        System.out.printf("\nCt:%s Aver%s", myList.size(),aver);
    }
}
