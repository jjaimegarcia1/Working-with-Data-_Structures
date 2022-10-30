import lib.FileIOV2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
public class OrderManagerMain {
        public static void main(String[] args) {
            String fName = "data/order_status.csv";
            FileIOV2 fio = new FileIOV2(fName);
            ArrayList<String> inLines = null;
            try {
                fio.setFileData();
                inLines = fio.getFileData();
            } catch (Exception e) {
                System.out.printf("\n Cannot open file:%s", fName);
                System.out.printf("\n Msg%s", e.getMessage());
                System.exit(1);
            }
            int field2 = 0;
            LinkedHashMap<String, Integer> theCounts2 = CountItems(inLines, field2);
            showCounts(theCounts2);
        }

        private static void showCounts(LinkedHashMap<String, Integer> theCounts) {
            for (String key : theCounts.keySet()) {
                System.out.println(key);
            }
        }

        private static LinkedHashMap<String, Integer> CountItems(ArrayList<String> inLines, int field) {
            LinkedHashMap<String, Integer> theCounts = new LinkedHashMap<>();
            for (String line : inLines) {
                String[] toks = line.split(",");
                if (field > toks.length - 1) {
                    throw new IndexOutOfBoundsException("Wow field too big" + field);
                }
                String item = toks[field];
                if (!theCounts.containsKey(item)) {
                    theCounts.put(item, 1);
                } else {
                    int ct = theCounts.get(item);
                    ct += 1;
                    theCounts.put(item, ct);
                }
            }
            return theCounts;
        }
    }
