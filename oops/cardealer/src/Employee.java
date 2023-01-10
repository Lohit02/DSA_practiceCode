public class Employee {
    public void handleCust(Customer cust,boolean finance, Vechile vechle)
    {
        if(finance== true)
        {
            double loanamount= vechle.getPrice()-cust.getCashOnHand();
            runCreditHistory(cust,loanamount);
        }
    }
    public void runCreditHistory(Customer cust,double loanamount)
    {
        System.out.println("approved");
    }
}
