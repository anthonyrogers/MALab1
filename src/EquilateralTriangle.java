public class EquilateralTriangle extends Triangle {

    double sides;

    public EquilateralTriangle(String name){
        super(name);
    }

    public void setDimensions(double sides) {
        super.setDimensions(sides, sides, sides);
    }


}
