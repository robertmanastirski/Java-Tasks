public class Parallelogram extends Quadrilatera{
    private double dimensionOne;
    private double dimensionTwo;
    private double height;
    private String name = "Parallelogram";
    
    public Parallelogram(double dimensionOne, double dimensionTwo, double height) {
        this.dimensionOne = dimensionOne;
        this.dimensionTwo = dimensionTwo;
        this.height = height;
    }
    @Override
    public double getArea() {
        double base = dimensionOne;
        return base*height;
    }
    @Override
    public double getPerimeter() {
        double sideOne = dimensionOne+dimensionTwo;
        double sideTwo = dimensionOne+dimensionTwo;
        return sideOne+sideTwo;
    }

    @Override
    public String whoAmI() {
        return name;
    }
}
