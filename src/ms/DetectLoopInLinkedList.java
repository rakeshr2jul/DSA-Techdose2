package ms;

public class DetectLoopInLinkedList {


    public static LinkList  detectLoop(LinkList list){
        if(list.next == null)
            return null;
        LinkList slow = new LinkList();
        LinkList fast = new LinkList();
         slow =  list.next;
        fast = list.next;

        while (slow !=null && slow.next !=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
                return slow;
        }

       return null;
    }

    public static LinkList getStartingNode(LinkList list){
         if(list==null)
             return null;

         LinkList intersection =detectLoop(list);
         LinkList slow =list.next ;

         while (slow !=intersection){
             slow = slow.next;
             intersection = intersection.next;
         }
       return slow;
    }

    public static void removeLoop(LinkList list){

        LinkList startOfLoop= getStartingNode(list);
       LinkList temp = startOfLoop;

       while (temp.next != startOfLoop){
           temp = temp.next;
       }
       temp.next = null;
    }

    public static void removeElements(LinkList list) {

        list.data = list.next.data;
        list.next = list.next.next;

    }

    public static LinkList removeElements(LinkList head, int val) {
            if(head == null)
                return null;

          LinkList dummy = new LinkList();
          dummy.next = head;
          LinkList curr = dummy;

          while (curr.next !=null){
              if(curr.next.data == val){
                curr.next = curr.next.next;
              }else{
                   curr = curr.next;
              }
          }
          return dummy.next;
    }
    public static void main(String args[]){

        LinkList list = new LinkList();
        LinkList first = new LinkList(1,list);
        LinkList second = new LinkList(2,first);
        LinkList third = new LinkList(3,second);
        LinkList fourth = new LinkList(4,third);
        LinkList fifth = null;

        list.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        LinkList node = detectLoop(list);
        System.out.println("Loop detected "+node.data);

        LinkList node1= getStartingNode(list);
        System.out.println("starting node "+node1.data);

        removeLoop(list);

        LinkList.printList(list);
      //  removeElements(list);
        removeElements(list,3);

        LinkList.printList(list);

    }
}
