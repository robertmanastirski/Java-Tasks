
import java.util.ArrayList;

public class Visit{
    private ArrayList<Customer> customers = new ArrayList<>();
    
    public void enterSalon(ArrayList<Customer> customers)
    {
        this.customers = customers;
    }
    public void serveClient()
    {
        for (Customer c : customers) {
            System.out.println(c.getName() + " is getting: " + c.getType() + ", " + c.getProductName() +" for " + c.getPrice());
        }
        System.out.println("---------------");
    }
    public void outputPayment()
    {
        for (Customer c : customers) {
            Membership m1 = new Membership(c.getName(), c.getMembership(), c.getType(), c.getProductName(), c.getPrice());
            if (!c.getMembership().equals("None")) {
                System.out.println(c.getName() + " is a " + c.getMembership()+ " member" + " and gets a discount.");
                System.out.println("Price without discount: " + c.getPrice());
                System.out.println("Price with discount: " + m1.calculateDiscount());
                System.out.println("----");
            }else
            {
                System.out.println(c.getName() + " is not enrolled in the membership program.");
                System.out.println("Price: " + c.getPrice());
            }
            
        }
    
    }
    
}
