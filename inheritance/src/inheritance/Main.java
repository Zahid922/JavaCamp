package inheritance;

public class Main {

    public static void main(String[] args) {
        SendikaCustomer abc = new SendikaCustomer();
        IndividualCustomer zahid = new IndividualCustomer();
        CorporateCustomer hepsiburada = new CorporateCustomer();
        zahid.customerNumber = "12345";        
        hepsiburada.companyName = "Hepsi Burada";
        hepsiburada.customerNumber = "456321"; 
        abc.customerNumber = "98765";
        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {zahid , hepsiburada ,abc};
        customerManager.addMultiple(customers);
        
    }
}
