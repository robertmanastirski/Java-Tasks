public class Membership extends Customer {
    private double discountedPrice;
    
    public Membership(String customerName, String membership, String type, String productName, int price) {
        super(customerName, membership, type, productName, price);
    }
    
    public double calculateDiscount()
    {
        switch(super.getMembership())
        {
            case "Diamond":
            discountedPrice = super.getPrice() - (super.getPrice() * 20 / 100); break;
            case "Gold":
            discountedPrice = super.getPrice() - (super.getPrice() * 20 / 100); break;
            case "Silver":
            discountedPrice = super.getPrice() - (super.getPrice() * 20 / 100); break;
        }
        return discountedPrice;
    }
    
}
