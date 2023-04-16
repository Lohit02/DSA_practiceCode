package linkedlistdataStructure;

public class singlylinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createss( int val)
    {
        head= new Node();
        Node node= new Node();
        node.next=null;
        node.value=val;
        head= node;
        tail=node;
        size=1;return head;


    }

}
