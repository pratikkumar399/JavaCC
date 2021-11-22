package basicprograms;

class Shape {
	
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
	

}
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}


class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}
}
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}


public class Classtype {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
        System.out.println("Lovepreet" + "20BCS2834");
	}

}