package shapes;

public class Square extends Quadrilateral{

    public Square(double side){
        super(side, side);
    }


    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    //    private int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea(){
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter(){
//        return side *4;
//
//    }
}
