import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle");
        Square square = new Square("Square");
        Circle circle = new Circle("Circle");
        EquilateralTriangle eTriangle = new EquilateralTriangle("Equal Triangle");

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the frist side of the triangle: ");
        double Tri1 = s.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double Tri2 = s.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double Tri3 = s.nextDouble();

        triangle.setDimensions(Tri1,Tri2,Tri3);

        System.out.println("Enter the length of the square: ");
        double L1 = s.nextDouble();
        System.out.println("Enter the height of the square: ");
        double L2 = s.nextDouble();

        square.setDimensions(L1,L2);

        System.out.println("Enter the radius of the circle: ");
                double C1 = s.nextDouble();

        circle.setDimensions(C1);

        System.out.println("Enter the length of equal triangle: ");
        double ET1 = s.nextDouble();

        eTriangle.setDimensions(ET1);


        System.out.println("The area of the Triangle is: " + triangle.getArea());
        System.out.println("The area of the square is: " + square.getArea());
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The area of the Equal Triangle is: " + eTriangle.getArea());







    }
}
