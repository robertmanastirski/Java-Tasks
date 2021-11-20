public class Circle extends Shape{
    private double radius;
    private String name = "Circle";
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String whoAmI() {
        return name;
    }
    
}
