import shape.Shape;

public class Rectangle extends Shape {
    int length;
    int breadth;

    public Rectangle(){
        super("Rectangle");
    }

    public Rectangle(int length, int breadth){
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void displayShape() {
        System.out.println("Hey, I'm a "+this.name+" My area is: "+this.area);
    }

    @Override
    public void setArea() {
        this.area = this.length*this.breadth;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
