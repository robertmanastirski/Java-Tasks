public class ServiceProduct {
    private String type;
    private String name;
    private int price;
    
    public ServiceProduct(String type, String productName, int price)
    {
        this.type = type;
        this.name = productName;
        this.price = price;
    }
    public String getType()
    {
        return type;
    }
    public String getProductName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    
}
