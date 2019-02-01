import shape.Shape;

public class Square extends Shape {
    int side;

    public Square(){
        super("Square");
    }

    public Square(int side){
        super("Square");
        this.side = side;
    }

    @Override
    public void displayShape() {
        System.out.println("Hey, I'm a "+this.name+" My area is: "+this.area);
    }

    @Override
    public void setArea() {
        this.area = this.side*this.side;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
