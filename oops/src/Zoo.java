public class Zoo {
    public static void main(String[] args) {
//        Animal loo= new Animal(12, 4, "tiger") {
//            @Override
//            public void move() {
//
//            }
//        };
//        loo.name="tiger";
//        loo.age=9;
//        loo.legs=4;
//        loo.walk();
////        loo.sleep();
////         Bird bird= new Bird(2,2,"lili");
////          bird.fly();
////         bird.sleep();
////         bird.walk();
////         Chicken chi= new Chicken();
////         chi.fly();
////         chi.walk();
////        bird.fly();
////        Sparrow spr= new Sparrow();
////        spr.fly();
//        Chicken chi = new Chicken();
//       // chi.fly();
//          chi.move();
//          Bird bd= new Bird();
//          Bird bd1= new Bird(12,2,"lo");
//          bd1.walk();
//          bd.move();
//          Sparrow spw= (Sparrow) new Bird();
//          spw.fly();
//        Bird look= new Bird();
//         look.fly();
//         Bird looi= new Sparrow();
//         looi.fly();
        Animal look= new Animal() {
            @Override
            public void move() {
                //System.out.println("walky");
            }
        };
        look.sleep();
    }
}
