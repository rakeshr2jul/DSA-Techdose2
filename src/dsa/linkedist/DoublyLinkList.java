package dsa.linkedist;

public class DoublyLinkList {

    public static void main(String args[]){
        Node1 head = new Node1(10);
       head.insertBegin(head,20);

       printList(head);

    }

    static void printList(Node1 head){
        Node1 curr = head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.prev;
        }
        // printList(head.next);
    }


}

class Node1{

    int data;
    Node1 prev;
    Node1 next;
    Node1(int d){
        data = d;
        prev =null;
        next = null;
    }

    public Node1 insertBegin(Node1 head,int data){

        Node1 temp = new Node1(data);
        temp.next=head;
        if(head!=null)
            head.prev=temp;

        return temp;
    }

    public Node1 reverse(Node1 head){

        if(head==null||head.next==null)
            return head;

        Node1 prev = null;
        Node1 curr = head;

        while (curr!=null){
         prev = curr.prev;
         curr.prev = curr.next;
         curr.next = prev;
         curr = curr.prev;
         }

        return prev.prev;
    }

    public Node1 delHead(Node1 head){
        if(head == null) return null;

        if(head.next== null) return null;
        else {
            head = head.next;
            head.prev = null;
        }
        return head;
    }

}