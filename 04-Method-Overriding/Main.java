class Shape {
    void area() {
        System.out.println("Area calculation");
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        int length = 5;
        int breadth = 4;
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
