import java.util.ArrayList;
import java.util.Arrays;

public class GeometricShapes {
    static void ShowGroupedAreaAndPerimeter(ArrayList<Shape> shapes)
    {
        double areaSum = 0;
        double perimeterSum = 0;
        ArrayList<String> calculated = new ArrayList<>();
        
        for (Shape shape : shapes) {
            for (int i = 0; i < shapes.size(); i++) {
                if (shape.whoAmI().equals(shapes.get(i).whoAmI())) {
                    if (!calculated.contains(shape.whoAmI())) {
                        areaSum += shapes.get(i).getArea();
                        perimeterSum += shapes.get(i).getPerimeter();
                    }else
                    {
                        break;
                    }
                }
            }
            if (!calculated.contains(shape.whoAmI())) {
                calculated.add(shape.whoAmI());
                System.out.println("Shape " + shape.whoAmI() + ": ");
                System.out.println("Total area: " + areaSum);  
                System.out.println("Total perimeter: " + perimeterSum);
                areaSum = 0;
                perimeterSum = 0;
            }
        }          
    }
    
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>(Arrays.asList(
                                                        new Circle(10),
                                                        new IsoscelesTriangle(10, (Math.PI / 180) * 120),
                                                        new IsoscelesTriangle(10, (Math.PI / 180) * 35),
                                                        new Circle(15),
                                                        new Rhombus(20,10),
                                                        new Rectangle(20,30),
                                                        new Rectangle(5,10),
                                                        new Rectangle(6,9),
                                                        new Square(20)
                                                        ));

        ShowGroupedAreaAndPerimeter(shapes);

    }
}
