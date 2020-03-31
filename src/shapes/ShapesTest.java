package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;


        myShape = new Rectangle(4,5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("===============================");

        myShape = new Square(8);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(8);
//        System.out.println("================");
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());



    }

}
