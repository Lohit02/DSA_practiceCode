package treedataStructure;

public class BinaryserachTree {
    BinaryNode root;
    BinaryserachTree()
    {
        root=null;
    }
    // insert method
    private BinaryNode insert(BinaryNode currentNode, int value)
    {
        if(currentNode==null)
        {
            BinaryNode newNode= new BinaryNode(value);
            newNode.value=value;
            System.out.println("The value successfully inserted");
            return newNode;
        }
        else if(value<= currentNode.value)
        {
            currentNode.left= insert(currentNode.left,value);
            return currentNode;
        }
        else
        {
            currentNode.right= insert(currentNode.right,value);
            return currentNode;
        }

    }
    void insert(int value)
    {
      root=  insert(root,value);
    }
    //preorder traversal
    public void preOrder(BinaryNode node)

    {
        if(node== null)
        {
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder traversal
    public void inOrder(BinaryNode node)
    {
        if(node==null)
        {
            return;
        }else
            inOrder(node.left);
            System.out.println(node.value+" ");
            inOrder(node.right);
    }


}
