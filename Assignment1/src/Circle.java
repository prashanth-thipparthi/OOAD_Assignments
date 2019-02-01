import shape.Shape;

public class Circle extends Shape {
    int radius;

    public Circle(){
        super("Circle");
    }

    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void displayShape() {
        System.out.println("Hey, I'm a "+this.name+" My area is: "+this.area);
    }

    @Override
    public void setArea() {
        this.area = 3.14*this.radius*this.radius;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
