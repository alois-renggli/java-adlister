package shapes;
import org.w3c.dom.css.Rect;
import util.Input;

public class CircleApp {

    //    Inside of shapes, create a class named CircleApp that prompts the user
// for the radius of the circle using your Input class, creates a
// Circle object, and displays the circumference and area.
// (Note that you will need to import your Input class.)
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getInt());

//        int inputValue = input.getInt();
//        Circle test = new Circle(inputValue);
//        System.out.println("The radius is " + inputValue);
//        System.out.printf("The area is %.2f\n", test.getArea());
//        System.out.printf("The circumference is %.2f\n", test.getCircumference());

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }

}
