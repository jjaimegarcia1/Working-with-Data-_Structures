import lib.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class InClass_OrderProcess_9_20 {
    public static void main(String[] args) throws FileNotFoundException {
        String fName = "Data/order_status.csv";
        FileIO fio = new FileIO(fName);
        fio.setFileData();
        ArrayList<String> inLines=fio.getFileData();
        System.out.printf("\n len:%s",inLines.size());

        ArrayList<OrderItem> items= createOrderItems(inLines);
        System.out.printf("\n Got %s structured items",items.size());
        OrderManager om=new OrderManager(items);
//        ArrayList<OrderItem> retItems= om.findOrder(1234);
//        System.out.printf("\n Found 1234:%s times", retItems.size());
//        ArrayList<OrderItem> retItems2= om.findOrder(12345);
//        System.out.printf("\n Found 12345:%s times", retItems2.size());
        if(om.gotThisOrder(1234)){
            System.out.printf("\ngot Order 1234");
        }
        else{
            System.out.printf("\n Didnt get order 1234");
        }
//        inLines.add("Is a nice day but its getting chilly");
//        String fName2 = "Data2/myNewFile.txt";
        FileIOV2 fileIOV2=new FileIOV2(fName);
        fileIOV2.writeFileData(inLines);
    }

    private static ArrayList<OrderItem> createOrderItems(ArrayList<String> inLines) {
        ArrayList<OrderItem> oitems=new ArrayList<>();
        boolean firstLine=true;
        int ct=0;
        for(String line:inLines){
            ct++;
            if(firstLine){ // this skips the header of the csv file because you dont need the title
                firstLine=false;
                continue;
            }
            String[]toks=line.split(";");
            try {
                int oId = Integer.parseInt(toks[0]);
                int lId = Integer.parseInt(toks[1]);
                int pId = Integer.parseInt(toks[2]);
                int quant = Integer.parseInt(toks[3]);
                String status = toks[4];
                double value = Double.parseDouble(toks[5]);
                oitems.add(new OrderItem(oId, lId, pId, quant, status, value));
            }
            catch (Exception e){
                System.out.printf("\n oooopsss HELP DO SOMETHING %s",ct);
                System.exit(1);
            }
        }
        return oitems;
    }
}
