public class Main {
    public static void main(String[] args) {
        singlylinkedlist mylist= new singlylinkedlist();
        mylist.insertF(90);
        mylist.insertF(98);
        mylist.insertF(80);
        mylist.insertP(1,7);
        mylist.insertP(3,74);
        mylist.insertP(4,56);
       // mylist.insertPo(1,12);
       // mylist.deleteF();
       // mylist.deleteL();
        //mylist.deleteP(1);


        mylist.display();
        System.out.println(mylist.getnode(3));
        mylist.find(7);
       // mylist.find(3);

    }
}
