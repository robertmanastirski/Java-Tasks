public class Rectangle extends Quadrilatera{
    private double dimensionOne;
    private double dimensionTwo;
        private String name = "Rectangle";
        
    public Rectangle(double dimensionOne, double dimensionTwo)
    {
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
    }
    @Override
    public double getArea() {
        return dimensionOne*dimensionTwo;
        
    }
    @Override
    public double getPerimeter() {
        double sideOne = dimensionOne*2;
        double sideTwo = dimensionTwo*2;
        return sideOne+sideTwo;
    }

    @Override
    public String whoAmI() {
        return name;
    }
}
