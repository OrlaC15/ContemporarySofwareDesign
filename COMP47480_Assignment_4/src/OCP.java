/**
 * Created by Orla on 03/04/2018.
 */
public class OCP {
    public static void main(String[] args) {
        Square square = new Square(10.1);
        PostageStamp stamp = new PostageStamp(square);
        System.out.println(stamp.toString());
    }
}
class PostageStamp{
    public PostageStamp(Shape square){
        shape = square;
    }
    public String toString(){
        return "stamp, contained in a " + shape.toString();
    }
    Shape shape;
}



abstract class Shape {
    private double length;

    public Shape(double d) {
        length = d;
    }
    public String toString() {
        double length= getLength();
        return "square, side of length " + length;
    }

    public double getLength() {
        return length;
    }
}

class Square extends Shape {

    protected Square(double d) {
        super(d);
    }


}
