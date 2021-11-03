public class Customer extends ServiceProduct{
    private String customerName;
    private String membership;
    
    public Customer(String customerName, String membership, String type, String productName, int price) {
        super(type, productName, price);
        this.customerName = customerName;
        this.membership = membership;
    }
    
    public String getName()
    {
        return customerName;
    }
    public String getMembership()
    {
        return membership;
    }
    public String getType()
    {
        return super.getType();
    }
    public String getProductName()
    {
        return super.getProductName();
    }
    public int getPrice()
    {
        return super.getPrice();
    }
    
}
