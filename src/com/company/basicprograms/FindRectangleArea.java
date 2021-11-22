package basicprograms;

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {   
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}

class Sqaure extends Rectangle {
 
    Sqaure(double length, double breadth ) {
        super(length, breadth);
        
        
    }
    
}



public class FindRectangleArea
{
    public static void main(String arg[])
    {
        Rectangle rect = new Rectangle(10, 5);
        Sqaure s = new Sqaure(10,20) ;
        System.out.println(rect.getArea() );
        System.out.println(rect.getPerimeter());
        int side = 20 ;
        
        System.out.println("Perimeter " + 4*side);
        System.out.println("Area " + side*side);
    
    }
}

