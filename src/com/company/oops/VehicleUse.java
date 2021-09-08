package oops;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() ;
        v.color = "Red" ;
        v.maxSpeed = 80 ;
        v.print();

        Car c = new Car() ;
        c.color = "Black" ;
        c.maxSpeed = 100 ;
        c.doors = 4 ;
        c.printCar(); 
    }
}
