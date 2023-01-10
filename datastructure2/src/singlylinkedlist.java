public class singlylinkedlist {
    private node head;

    public void insertF(int val) {


        node newnode = new node(val);
        //newnode.val=val;
        newnode.next = head;
        head = newnode;
    }
    public void insertP(int index,int val)
    {
        node temp=head;
        node current=null;
        for(int i=0;i<index;i++)
        {
            current=temp;
            temp=temp.next;
        }
        node newnode= new node( val,temp.next);
        current.next=newnode;
        newnode.next= temp;
    }
  /*  public void insertPo(int index,int val)
    {
        node current = null;
        for(int i=0;i<index;i++)
        {
            current=head;
            head=head.next;
        }
        node newnode= new node(val,head.next);
        current.next=newnode;
        newnode.next=head;
    }
    */
   public int deleteF()
   {
       int val= head.val;
       head=head.next;
       return val;
   }
   public int deleteL()
   {
       int val=0;

       node temp=head;
       while(temp.next.next!= null)
       {
          temp=temp.next;
       }
       temp.next=null;
       val=temp.val;
       return val;
   }
   public int deleteP(int index)
   {
       int val=0;
       node current=null;
       node temp=head;
       for(int i=0;i<index-1;i++)
       {
           temp=temp.next;
       }
       current= temp;
       temp= temp.next;
       val= temp.val;
       current.next=temp.next;
       return val;
   }

    public void find(int val) {
        node newnode = head;int index=0;
        while (newnode.val != val)
        {
           newnode= newnode.next;
           index++;
        }
        System.out.println(index);
    }
    public int getnode(int  index)
    {
        node temp=head;
        int val=0;
        for (int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        temp=temp.next;
        val=temp.val;
        return val;

    }


    public void display()
    {
        node temp= head;
        while(temp!= null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
