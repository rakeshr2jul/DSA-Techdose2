package ms;

public class LinkList {
     LinkList next;
     int data;

    LinkList() {}
    LinkList(int val) {
        this.data = data;
    }
    LinkList(int val, LinkList next) {
        this.data = val; this.next = next;
    }
    /*static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }*/

    public static LinkList insert(LinkList list,
                                    int data)
    {
        // Create a new node with given data
        LinkList new_node = new LinkList(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.next == null) {
            list.next = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            LinkList last = list.next;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public static void printList(LinkList list)
    {
        LinkList currNode = list.next;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }


}
