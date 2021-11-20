public class IsoscelesTriangle extends Triangle {
    private double dimensionOne;
    private double angle;
    private double base;
    private String name = "IsoscelesTriangle";
    
    public IsoscelesTriangle(double dimensionOne, double angle)
    {
        this.dimensionOne = dimensionOne;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        double angleDivided = angle / 2;
        base = 2 * dimensionOne * Math.cos(angleDivided);
        double height = dimensionOne * Math.sin(angleDivided);
        return 0.5 * Math.pow(dimensionOne, 2) * Math.sin(2 * angleDivided);
    }

    @Override
    public double getPerimeter() {
        return 2 * dimensionOne + base;
    }

    @Override
    public String whoAmI() {
        return name;
    }
}
