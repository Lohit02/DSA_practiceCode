package BinaryTree;

import treedataStructure.BinaryNode;

public class Main {
    public static void main(String[] args) {
        CreateTree btree= new CreateTree();

        btree.insert(new Node(5));
        btree.insert(new Node(1));
        btree.insert(new Node(9));
        btree.insert(new Node(2));
        btree.insert(new Node(7));
        btree.insert(new Node(3));
        btree.insert(new Node(6));
        btree.insert(new Node(4));
        btree.insert(new Node(8));
        //btree.display();
        //System.out.println( btree.search(2));
        



        CreateTreePrev btreepr= new CreateTreePrev();
        btreepr.insert(5);
        btreepr.insert(new BinaryNode(1));
        btreepr.insert(new BinaryNode(9));
        btreepr.insert(new BinaryNode(2));
        btreepr.insert(new BinaryNode(7));
        btreepr.insert(new BinaryNode(3));
        btreepr.insert(new BinaryNode(6));
        btreepr.insert(new BinaryNode(4));
        btreepr.insert(new BinaryNode(8));
      //  btreepr.display();
        //System.out.println( btreepr.search(2));






//
//        btree.insert(728);
//        btree.insert(780);
//        btree.insert(178);
//        btree.insert(278);

      //  btree.preOreder(CreateTree.root);

      //  btree.remove(1);
       // btree.preOreder(CreateTree.root);

    }
}
