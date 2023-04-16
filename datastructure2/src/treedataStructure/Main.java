package treedataStructure;

public class Main {
    public static void main(String[] args) {

        BinaryserachTree newBst= new BinaryserachTree();
        newBst.insert(70);
        newBst.insert(80);
        newBst.insert(90);
        newBst.insert(12);
          newBst.preOrder(newBst.root);
    }


}
