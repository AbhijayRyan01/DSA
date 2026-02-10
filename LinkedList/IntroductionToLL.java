class IntroductionToLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
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

    public void deleteFirst(){
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null) {
        System.out.println("The list is empty");
        return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) { 
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;        
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

    public static void main(String[] args) {
        IntroductionToLL list = new IntroductionToLL();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.addLast("LinkedList");
        // list.printList(); 
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        list.reverseIterate();
        list.printList();
    }
}