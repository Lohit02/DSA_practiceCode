import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
       path("",3,3);
        System.out.println( pathRet("",3,3));
    }
    static int count(int r, int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static void path(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            path(p+'D',r-1,c);

        }
        if(c>1)
        {
             path(p+'R',r,c-1);
        }


    }

    private static ArrayList<String> pathRet(String s, int r, int c) {
        if(r==1 && c==1)
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1 && c>1)
        {
            list.addAll(pathRet(s+'D',r-1,c)) ;

        }
        if(r>1)
        {
            list.addAll(pathRet(s+'V',r-1,c)) ;

        }
        if(c>1)
        {
            list.addAll(  pathRet(s+'H',r,c-1));
        }
        return list;
    }
    }
