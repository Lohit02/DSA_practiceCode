package BinaryTree;

import treedataStructure.BinaryNode;


public  class CreateTreePrev {

    BinaryNode root;

    public CreateTreePrev() {
        this.root = root;
    }


    public void insert(int data)
    {
        root=insertHelper(root,data);

    }

    private BinaryNode insertHelper(BinaryNode node, int value) {
        if(node==null)
            node = new BinaryNode(value);
        else {
            if(node.value>value)
            {
                node.left=insertHelper(node.left,value);
            }
            else
                node.right=insertHelper(node.right, value);
        }
        return node;
    }


    public void insert(BinaryNode node)
    {
        root= insertHelper(root,node);
    }
    private BinaryNode insertHelper(BinaryNode root,BinaryNode node)
    {
        int data= node.value;
        if(root== null)
        {
            root=node;
            return root;
        }
        else if (data<node.value)
        {
            root.left=insertHelper(root.left,node);
        }
        else{
            root.right=insertHelper(root.right,node);
        }
        return root;
    }
    public void display()
    {
        displayHelper(root);
    }
    public void displayHelper(BinaryNode root){
        if(root!=null)
        {
            displayHelper(root.left);
            System.out.println(root.value+" ");
            displayHelper(root.right);
        }
    }
    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(BinaryNode root, int data) {

        if(root == null) {
            return false;
        }
        else if(root.value == data) {
            return true;
        }
        else if(root.value > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }
    public void remove(int data)
    {
        if(search(data))
        {
            removeHelper(root,data);
        }else
            System.out.println(data+"Data don't found");
    }
    public BinaryNode removeHelper(BinaryNode root, int data)
    {
        if(root==null)
        {
            System.out.println("Tree is empty");
        }
        else if (data<root.value) {
            root.left=removeHelper(root.left,data);
        }
        else if (data> root.value) {
            root.right=removeHelper(root.right,data);
        }
        else
        {
            if(root.left==null && root.right==null)
            {
                root=null;
            }
            else if(root.left!=null)
            {
                root.value= predecessor(root);
                root.left=removeHelper( root.left,root.value);
            }
            else if(root.right!=null)
            {
                root.value= successor(root);
                root.right=removeHelper( root.right,root.value);
            }
        } return root;
    }
    private int successor(BinaryNode root)// find the least value of the right child of root node
    {
        root=root.right;
        while(root.left!=null)
        {
            root=root.left;
        }return root.value;
    }
    private int predecessor(BinaryNode root)
    {
        root=root.left;
        while(root.right!=null)
        {
            root=root.right;
        }
        return root.value;
    }
    //preorder
    void preOreder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOreder(node.left);
        preOreder(node.right);

    }
    //InOrder
    void inOrder(BinaryNode node)
    {
        if(node== null)
        {
            return;
        }
        inOrder(node.left);
        System.out.println();
        inOrder(node.right);
    }
    //postOrder
    void postOrder(BinaryNode node)
    {
        if(node== null)
        {
            return;
        }
        postOrder(node.left);
        System.out.println();
        postOrder(node.right);
    }


}
