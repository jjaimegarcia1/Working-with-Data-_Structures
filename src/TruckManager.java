import lib.FileIOV2;

import java.util.*;

public class TruckManager {
    public static void main(String[] args) {
        String fName = "data/truckOrder.txt";
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
        inLines.remove(0);
        Deque<TruckObject> trucks = new LinkedList<>();
        Deque<TruckObject> deleted;

        int field = 0;
        for (String line : inLines) {
            String[] toks = line.split(",");

            if (field > toks.length - 1) {
                throw new IndexOutOfBoundsException("Wow field too big" + field);
            }
            trucks.addFirst(new TruckObject(Integer.parseInt(toks[field]), Integer.parseInt(toks[field + 1]),toks[field + 2]));
        }

        System.out.println("------Showing the current alley of trucks-------");
        Showall(trucks);
        System.out.println("Select what truck id to remove or enter x to exit");
        System.out.println(Showtruckid(trucks));
        ArrayList<Integer> truckidlist = Showtruckid(trucks);
        Scanner ask = new Scanner(System.in);
        int newInput;
        while (!ask.hasNext("x")) {
            int userInput;
            ask.hasNextInt();
            try {
                newInput = Integer.parseInt(ask.nextLine());
                userInput = newInput;
                if (!truckidlist.contains(userInput)) {
                    System.out.println("Number is not in list, please re-type in an Integer or x to exit");
                } else {
                    System.out.println("-----Will need to move these first-----");
                    Deque<TruckObject> showb4 = showbefore(trucks, userInput);
                    for (TruckObject remove1 : showb4) {
                        System.out.println(remove1);
                    }
                    deleted = Removetrucks(trucks, userInput);
                    System.out.println("Removing truck #" + userInput);


                    trucks.removeAll(deleted);
                    System.out.println("New list");
                    Showall(trucks);
                    System.out.println("Select what truck id to remove or enter x to exit");
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not an Integer please re-type in an Integer or x to exit");
            }
        }

    }

    private static Deque<TruckObject> showbefore(Deque<TruckObject> trucks, int userInput) {
        Deque<TruckObject> showb4 = new LinkedList<>();
        for (TruckObject found : trucks) {
            showb4.addFirst(found);
            if (Objects.equals(found.getTruckID(), (userInput))) {
                return showb4;
            }
        }
        return showb4;
    }


    private static Deque<TruckObject> Removetrucks(Deque<TruckObject> trucks, int userInput) {
        Deque<TruckObject> deleted = new LinkedList<>();
        for (TruckObject found : trucks) {
            if (Objects.equals(found.getTruckID(), (userInput))) {
                deleted.addFirst(found);
            }

        }
        return deleted;
    }

    private static ArrayList<Integer> Showtruckid(Deque<TruckObject> trucks) {
        ArrayList<Integer> truckidlist = new ArrayList<>();
        for (TruckObject truckid : trucks) {
            truckidlist.add(truckid.getTruckID());
        }
        Collections.sort(truckidlist);
        return truckidlist;
    }

    private static void Showall(Deque<TruckObject> trucks) {
        for (TruckObject truck : trucks) {
            System.out.println(truck);
        }

    }
}
