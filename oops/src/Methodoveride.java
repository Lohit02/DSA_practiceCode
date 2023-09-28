public class Methodoveride {
    public void show(){
        System.out.println("method overriding");
    }
}

class D  extends Methodoveride{
    @Override
    public void show() {
        System.out.println("Conflict");
    }
}
