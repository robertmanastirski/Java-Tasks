
import java.util.ArrayList;

public class BeautySalon {
        
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Britney", "Diamond", "Service", "Hair", 50));
        customers.add(new Customer("Louise", "Gold", "Product", "Shmapoo", 43));
        customers.add(new Customer("Georgia", "Silver", "Service", "Nails", 30));
        customers.add(new Customer("Lesley", "None", "Product", "Nail Polish", 20));
        
        Visit v1 = new Visit();
        v1.enterSalon(customers);
        v1.serveClient();
        v1.outputPayment();
    }
}
