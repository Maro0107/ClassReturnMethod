class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
}

class MathMethods {
    public Circle getNewCircle(double radius){
        Circle c = new Circle(radius);
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
       MathMethods math = new MathMethods();
        Circle circle = math.getNewCircle(10);
        System.out.println(circle.radius);
    }
}
