package shapes;

import util.Input;

public class CircleApp {

    static Input input = new Input();


    public static void main(String[] args) {


        double userInput = input.getDouble();
        Circle circle = new Circle(userInput);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }



}
