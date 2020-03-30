package shapes;


import java.util.Scanner;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.length = width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public int getArea(){
        return length * width;
    }

}
