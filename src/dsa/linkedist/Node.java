package dsa.linkedist;

public class Node {

    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }


    static void printList(Node head){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
       // printList(head.next);
    }

    static Node insertBegin(Node head,int x){
        Node temp = new Node(x);
      //  temp.next = head;
        return temp.next;
    }
    static Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null)
            return temp;
        Node curr = head;
        while (curr.next!=null)
            curr = curr.next;

        curr.next = temp;
        return head;
    }
    static Node delete(Node head){
        if(head==null)
            return null;
        else
            return head.next;
    }

    static Node removeNodeFromEnd(Node head){
      if(head==null)
          return null;
      if(head.next==null)
          return null;
      Node curr =head;
      while (curr.next.next !=null)
          curr = curr.next;
      curr.next =null;

      return head;
    }

    static Node insertPos(Node head,int pos,int data){

        Node temp = new Node(data);
        if(pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
           curr = curr.next;
        }
        if(curr==null)
            return head;

        temp.next = curr.next;
        curr.next = temp;
        return head;


    }

    static int search(Node head,int data){

        int pos=1;
        Node curr = head;
        while (curr!=null){
            if(curr.data==data)
                return pos;
            else {
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      Node head = null;

     // head = insertBegin(head,50);
     // head = insertPos(head,2,5);
      head = insertEnd(head,30);
      head = insertEnd(head,20);
      head = insertEnd(head,10);
      head = insertPos(head,3,15);
      head = insertPos(head,5,40);

   //   head = removeNodeFromEnd(head);

      printList(head);

     // System.out.println("\n"+search(head,15));
   }
}
