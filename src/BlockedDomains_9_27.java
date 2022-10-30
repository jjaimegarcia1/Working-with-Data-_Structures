import lib.FileIOV2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class BlockedDomains_9_27 {
    public static void main(String[] args) {
        String fname= "Data/blockedDomains.txt";
        ArrayList<String> inLines=getblockedDomains(fname);
        System.out.printf("Size:%s",inLines.size());
        LinkedHashSet<String> bDomains= convertToHash( inLines);
        System.out.printf("Size:%s",bDomains.size());

        Boolean keepGoing = true;
        while(keepGoing){
            String uIn=getUserInput();
            if(uIn.equalsIgnoreCase("Stop")){
                keepGoing=false;
                break;
            }
            if(bDomains.contains(uIn)){
                System.out.printf("\n Thats ok :%s", uIn);
            }
            else {
                System.out.printf("\n Thats not Ok",uIn);
            }
        }
        showMeTheList(bDomains);
    }

    private static void showMeTheList(LinkedHashSet<String> bDomains) {
        for(String d: bDomains){
            System.out.printf("\n Domains:%s",d);
        }
    }

    private static String getUserInput() {
        System.out.printf("\n Enter Domain to check (or Stop):");
        Scanner s =new Scanner(System.in);
        return s.nextLine();
    }

    private static LinkedHashSet<String> convertToHash(ArrayList<String> inLines) {
        LinkedHashSet<String> bDom=new LinkedHashSet<>();
        for (String line:inLines){
            bDom.add(line);
        }
        return bDom;
    }

    private static ArrayList<String> getblockedDomains(String fname) {
        FileIOV2 fio=new FileIOV2(fname);
        try{
        fio.setFileData();
        }
        catch (Exception e){
            System.out.printf("\n fname: %s problem", fname);
            System.out.printf("\n Exception: %s", e.getMessage());
            System.exit(1);
        }

        ArrayList<String>retLines=fio.getFileData();
        return retLines;
    }
}
