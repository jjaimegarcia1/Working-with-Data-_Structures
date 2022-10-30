public class Inclass10_27_2022 {
    public static void main(String[] args) {
        System.out.printf("\n Starting...");
        DoubleLL_10_27 dll= new DoubleLL_10_27();
        dll.addNode(12);
        dll.addNode(15);
        dll.addNode(25);
        dll.printNodes();

        dll.printBackwardsNodes();

        int popItem=dll.popTail();
        System.out.printf("\n Popped:%s", popItem);
        dll.printNodes();

        DoubleLL_10_27 dll2=new DoubleLL_10_27();
        dll.addNode(22);
        int popItem2=dll2.popTail();
        System.out.printf("\nPopped 22 :%s", popItem2);
    }

}
