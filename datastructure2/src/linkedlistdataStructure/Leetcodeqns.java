package linkedlistdataStructure;

public class Leetcodeqns {
    int size=0;
    public void insertNodeRec(int val, int index)
    {

    }
    private Node insertRec(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp= new Node(val,node);
            size++;
            return temp;
        }
       node.next= insertRec(val,index--,node.next);
        return node;
    }
}
