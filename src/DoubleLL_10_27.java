public class DoubleLL_10_27 {
    class Node{
        int item;
        Node previous;
        Node next;
        public Node(int item){
            this.item=item;
            this.next=null;
            this.previous=null;
        }
    }

    Node head, tail = null;

    public void addNode(int item) {
        Node newNode = new Node(item);
        if (head == null) { //Two cases if its the head and if its not, this is FIRST NODE, Main node is 12 (End of List)
            head=newNode;
            tail=newNode;
            head.previous=null;
            tail.next=null;
        }
        else{ // adding 15 next to  12 (End of List)
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }

        }
    public void printNodes() {
        Node current=head;
        System.out.printf("\n--Showing the nodes---");
        int ct=0;
        while(current!=null){
            System.out.printf("\n Count :%s, Item:%s",++ct,current.item);
            current = current.next;
        }
    }
    public void printBackwardsNodes() {
        Node current=tail;
        System.out.printf("\n--Showing the nodes Backwards---");
        int ct=0;
        while(current!=null){
            System.out.printf("\n Count :%s, Item:%s",++ct,current.item);
            current = current.previous;
        }
    }
    public int popTail(){
        //Remove the last item, Return -99 if not there, Else Return the value of the last item
        int retVal;
        if ( head == null && tail == null ){
            System.out.printf("\n FLAG 1");
            return -99;
        }
        if ( head == tail && head != null ){
            // 1 item case
            retVal = head.item;
            head = null;
            tail = null;
            return retVal;
        }else{
            // more than 1 node
            retVal = tail.item;
            tail = tail.previous;
            tail.next = null;
        }
        return retVal;
    }
    }
