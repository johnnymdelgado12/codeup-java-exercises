import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        boolean booleanTest = input.yesNo();
//        System.out.println(booleanTest);
        int intTest = input.getInt();
        System.out.println(intTest);
//        int minMax = input.getInt(1, 10);
//        System.out.println(minMax);
        double doubTest = input.getDouble();
        System.out.println(doubTest);
//        double minMaxDoub = input.getDouble(1.5, 10.25);
//        System.out.println(minMaxDoub);
    }

}
