import lib.FileIOV2;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SurveySummary_9_29 {
    public static void main(String[] args) {
        String fName="data/surveyResults.txt";
        FileIOV2 fio=new FileIOV2(fName);
        ArrayList<String> inLines=null;
        try{
            fio.setFileData();
            inLines=fio.getFileData();
        }
        catch (Exception e){
            System.out.printf("\n Cannot open file:%s", fName);
            System.out.printf("\n Msg%s",e.getMessage());
            System.exit(1);
        }
//        System.out.printf("\n Size:%s",inLines.size());
        int field=0;
        LinkedHashMap<String,Integer> theCounts= CountItems(inLines,field);
        showCounts(theCounts);
        System.out.printf("\n *************************************");
        //Trying out checking the second portion of commas
        int field2=1;
        LinkedHashMap<String,Integer> theCounts2= CountItems(inLines,field2);
        showCounts(theCounts2);
    }

    private static void showCounts(LinkedHashMap<String, Integer> theCounts) {
        for(String key:theCounts.keySet()){
            System.out.printf("\n For Key:%s Ct:%s", key,theCounts.get(key));
        }
    }

    private static LinkedHashMap<String, Integer> CountItems(ArrayList<String> inLines, int field) {
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

// Originally did with HashMap which returned answers randonmly with CTRL-R you can replace all to Tree Map
//Which will show your ourputs alphabetically
//THen did the same to use LinkedHashMap which outputs data in how it was discovered in the list
