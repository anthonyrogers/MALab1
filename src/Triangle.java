public class Triangle extends Shape {

    double side1;
    double side2;
    double side3;

    public Triangle(String name){
        super(name);
    }

    public void setDimensions(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    public void printDimensions(){
        System.out.println("The dimensions of the triangle are side1: " + side1 + " side2: " + side2 + " side3: "+ side3);
    }

    public double getArea(){
       double s = 0.5 * (side1 + side2 + side3);
       double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        return area;
    }
}
