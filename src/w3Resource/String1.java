package w3Resource;

public class String1 {
    public static void main(String[] args) {
    String operations[]= new String[]{"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String dt:operations)
        {

            if(dt=="++X"){
                x+=1;
            }
            if(dt=="X++"){
                x+=1;
            }
            if(dt=="--X"){
                x-=1;
            }
            if(dt=="X--"){
            x-=1;
        }

        } return x;
    }
}
