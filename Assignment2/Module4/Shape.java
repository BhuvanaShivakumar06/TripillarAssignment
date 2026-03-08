package Assignment2.Module4;

abstract class Shape {
    abstract void display();
}
class Circle extends Shape{
    void display(){
        System.out.println("this Shape is a Circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();

    }
}

