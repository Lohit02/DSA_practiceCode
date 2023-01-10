public class Bird extends Animal implements Flyable {
    public Bird()
    {

    }
    public Bird(int age,int legs,String name)
    {
        this.name=name;
        this.age=age;
        this.legs=legs;
    }

    @Override
    public void move() {
        System.out.println("uru uru");
    }

    // @Override
//    public void move() {
//        System.out.println("flapping wings");
//    }

    //    public void fly()
//    {
//        System.out.println("half half fly");
//    }
    public void fly()
    {
        System.out.println("flying...uru urru..");
    }
}
