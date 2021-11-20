public class Rhombus extends Quadrilatera{
    private double dimensionOne;
    private double height;
    private String name = "Rhombus";
        
    public Rhombus(double dimensionOne, double height)
    {
        this.dimensionOne = dimensionOne;
        this.height = height;
    }
    @Override
    public double getArea() {
        double base = dimensionOne;
        return base*height;
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
