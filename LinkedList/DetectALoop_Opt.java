class Node
{
    int data;
    Node next;
    @SuppressWarnings("unused")
    Node(int d) {data = d; next = null; }
} 

@SuppressWarnings("unused")
class DetectALoop_Opt {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}