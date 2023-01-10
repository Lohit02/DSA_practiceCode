public class Earth {
    public static void main(String[] args) {
        Human tom= new Human();
        tom.eat();
        tom.eyecolor="red";
        tom.getEyecolor();

        tom.age=90;
        int res= tom.getage();
        System.out.println(res);
        tom.speak();
    }
}
