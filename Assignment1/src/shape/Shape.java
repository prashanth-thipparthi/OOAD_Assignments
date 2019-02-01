package shape;

public abstract class Shape {
    protected String name;
    protected double area;

    public Shape(){

    }
    public Shape(String name){
        this.name = name;
    }

    abstract public void displayShape();
    abstract public void setArea();
    abstract public double getArea();
}
