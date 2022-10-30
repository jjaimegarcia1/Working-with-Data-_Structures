public class NodeDriver {
        public static void main(String[] args) {
            // chaining nodes through a linked list
//            Node node1= new Node("Apple");
//            node1.next=null;// pointer inside of node1 that shows the next node
//
//            Node node2=new Node("Baker");
//            node2.next= null;
//            node1.next= node2;
//
//            Node node3=new Node("Charlie");
//            node3.next= null;
//            node2.next= node3;
//
//            Node node4=new Node("Doug");
//            node4.next= null;
//            node3.next= node4;
//            showNodes(node1); // Giving it the head of the list
            // Lets do this in Stack Order, Following code will only change the order of the 2ndlink to be 1st
            Node node1= new Node("Apple");
            node1.next=null;
            Node head= node1;

            Node node2= new Node("Baker");
            node2.next=head; // you are assigning the first link to apple
            head= node2; //you are assigning the head to point to the B link

            Node node3= new Node("Charlie");
            node3.next=head;
            head= node3;

            Node node4= new Node("Doug");
            node4.next=head;
            head= node4;

            Node node5= new Node("Eustace");
            node5.next=head;
            head= node5;

            head =push("Fries",head);// created a push method because this automates putting your head in the front

            String topofStack = peek(head); //method for peek will show you only the top of the head

            head= pop(head); //pop will eliminate the top and return the rest

            System.out.printf("\n---- Top:%s", topofStack);

            showNodes(head);

            String needle="Doug"; // looking for doug
            if(isItInTheList(needle,head)){ //needle is what youre looking for, looking through heads
                System.out.printf("Yes it is in there",head);
            }else{
                System.out.printf("No its not in there",needle);
            }

            head= removeThisNode("Baker",head); //remove a randomNode
            System.out.printf("\n Showing nodes without baker");
            showNodes(head);

        }

    private static Node removeThisNode(String tok, Node head) {
            boolean gotIt= false;
            Node theNode=head;
            Node prevNode=null;
            int ct=1;
            while (theNode!=null){
                if (theNode.value.equalsIgnoreCase(tok)){
                    if(prevNode==null){
                        //edge case if trying to remove the head
                        return theNode.next;
                    }
                    prevNode.next=theNode.next;
            }
            prevNode=theNode;
            theNode=theNode.next;
            ct++;
        }
            return head;
    }

    private static Node pop(Node head) {
            head=head.next;
            return head;
    }

    private static String peek(Node head) {
            return head.value;
    }

    private static Node push(String tok, Node head) {
        Node theNode= new Node(tok);
        theNode.next=head;
        head= theNode;
        return head;
    }

    private static boolean isItInTheList(String needle, Node head) {
        Node theNode = head;
        int ct = 1;
        while (theNode != null) {
//            System.out.printf("\n Node :%s Ct:%s", theNode.value,ct);
            if (theNode.value.equalsIgnoreCase(needle)) {
                return true;
            }
            ct++;
            theNode = theNode.next;
        }
        return false;
    }

    private static void showNodes(Node head){
            Node theNode = head;
            int ct= 1;
            while( theNode!= null){
                System.out.printf("\n Node :%s Ct:%s", theNode.value,ct);
                ct++;
                theNode=theNode.next;
            }
        }
    }
