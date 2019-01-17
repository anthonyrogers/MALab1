public class Square extends Shape {

    double length;
    double height;


    public Square(String name){
    super(name);
    }

    public void setDimensions(double length, double height){
    this.length = length;
    this.height = height;
    }

    @Override
    public void printDimensions(){
        System.out.println("The height of the square is: " + height + " and the length is " + length);
    }

    public double getArea(){
        double area = this.length * this.height;

        return area;
    }


}

