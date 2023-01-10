public class Customer {

    String name;
    String address;
    double cashOnHand;
//    public Customer(String name, String add, double cash)
//    {
//        this.name= name;
//        this.address= add;
//        this.cashOnHand=cash;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vechile vechile, Employee emp, boolean finance)
    {
       emp.handleCust(this,false,vechile);
    }
}
