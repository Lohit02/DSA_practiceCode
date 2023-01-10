public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("tom");
        cust1.setAddress("kohinoor street");
        cust1.setCashOnHand(120000);
        Vechile vechile= new Vechile();
        Employee emp= new Employee();
        cust1.purchaseCar(vechile,emp,false);
        //cust1.purchaseCar(Vechile vechile, Employee emp, false);
    }
}
