abstract class Shape {
    int l, b;

    abstract void area();

    abstract void shape();
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area is=>" + l * b);
    }

    void shape() {
        System.out.println("Shape is => rectangle");
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        rectangle.shape();
        rectangle.area();
    }
}
