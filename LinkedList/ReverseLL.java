public class ReverseLL {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void reverseIterate(){

        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!= null){
            Node nextnode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextnode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node revereseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = revereseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
   public static void main(String args[]) {
        ReverseLL list = new ReverseLL();
        // list.printList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        // list.printList();
        // list.reverseIterate();
        list.printList();
        list.head = list.revereseRecursive(list.head);
        list.printList();
    }
}