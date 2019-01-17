public class Circle extends Shape {

    double radius;

    public Circle(String name){
        super(name);
    }

    public void setDimensions(double radius){
        this.radius = radius;

    }

    @Override
    public void printDimensions(){
        System.out.println("The radius of the circle is " + radius);
    }

    public double getArea(){
        double area = Math.PI * (Math.pow(radius, 2));

        return area;
    }
}
