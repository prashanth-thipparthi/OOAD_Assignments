import shape.Shape;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {


    public static int partition(ArrayList<Shape>s,int low,int high){
        double pivot = s.get(high).getArea();

        int i = low-1;
        int j = low;
        Shape tempShape;

        for(;j<=high;j++){
            if(s.get(j).getArea()<pivot){
                i+=1;
                //Collections.swap(s,i,j);
                tempShape = s.get(i);
                s.set(i,s.get(j));
                s.set(j,tempShape);

            }
        }

        tempShape = s.get(i+1);
        s.set(i+1,s.get(high));
        s.set(high,tempShape);
        return i+1;
    }
    public static void quickSort(ArrayList<Shape> s, int low, int high){

        if(high>low){
            int pivot = partition(s,low,high);
            quickSort(s,low,pivot-1);
            quickSort(s,pivot+1,high);
        }
    }
    public static void sortShape(ArrayList<Shape> s){
        int len = s.size();
        for(int i=0;i<len;i++){
            s.get(i).setArea();
        }

        quickSort(s,0,len-1);

    }

    public static void main(String args[]){
        /*
        Utilizing the Base class to hold all the Derived class objects
         */
        ArrayList<Shape> s = new ArrayList<Shape>();
        s.add(new Circle(3));
        s.add(new Square(4));
        s.add(new Rectangle(3,2));
        int len = s.size();

        /*
        Sorting the shapes based on the area
         */
        sortShape(s);

        /*
        Display the shapes
         */

        for(int i=0;i<len;i++){
            s.get(i).displayShape();
        }

    }
}
