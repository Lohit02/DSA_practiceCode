public class Human {
    String name;
    int age;
    int heightininches;
    String eyecolor;
    public Human()
    {

    }

    public void speak()
    {
        System.out.println("hello,my name is"+name);
        System.out.println("i am "+heightininches+"tall");
        System.out.println("i am"+age+"years old");
        System.out.println("my eye color is"+eyecolor);
    }
    public void eat()
    {
        System.out.println("eating....");
    }

    public int getAge() {
        return age;
    }
    public void walk()
    {
        System.out.println("walkig.....");
    }
    public void getEyecolor()
    {
        System.out.println(eyecolor);
    }
    public int getage()
    {
        return age;
    }
}
