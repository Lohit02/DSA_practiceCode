public abstract class Animal {
    int age;
    int legs;
    String name;
    public Animal()
    {

    }
    public Animal(int boyos,int paa,String naam)
    {
       this.name=naam;
       this.age=boyos;
       this.legs=paa;
    }
    public   void walk()
    {
        System.out.println("it has"+legs+"legs");
        System.out.println("it is a"+name);
        System.out.println("t is"+age+"years old");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
    public abstract void move();
}
