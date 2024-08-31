public class Polymorphism {
    public static void main(String arg[]) {
        Circle c = new Circle(1);
        Square s = new Square(1);
        Triangle t = new Triangle(1, 2);
        Shape shapeArray[] = {c, s, t};
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println("The area of " + i + "is " + shapeArray[i].calculateArea());
        }
    }
}

class Shape {
    String name[];

    float calculateArea() {return 0;}
}

class Circle extends Shape {
    private float radius;

    Circle(float x) {radius = x;}

    float calculateArea() {
        return (float)(radius * radius * 3.14);
    }
}

class Square extends Shape {
    private float side;

    Square(float s) {side = s;}

    float calculateArea() {
        return (float) (side * side);
    }
}

class Triangle extends Shape {
    private float side;
    private float height;

    Triangle(float x, float y) {
        side = x;
        height = y;
    }

    float calculateArea() {
        return (float) (0.5 * height * side);
    }
}