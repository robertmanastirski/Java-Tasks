public class Square extends Quadrilatera{
    private double dimensionOne;
    private String name = "Square";
    
    public Square(double dimensionOne)
    {
        this.dimensionOne = dimensionOne;
    }
    @Override
    public double getArea() {
        return dimensionOne * dimensionOne;
    }
    @Override
    public double getPerimeter() {
        return 4 * dimensionOne;
    }

    @Override
    public String whoAmI() {
        return name;
    }
}
