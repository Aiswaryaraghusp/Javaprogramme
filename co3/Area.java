class Shape{
	double x;
	Shape(double a){
		x=a;
	}
}
class Rectangle extends Shape{
	double y;
	Rectangle(double a,double b){
		super(a);
		y=b;
	}
	void area(double x,double y){
		System.out.println("Area of rectangle:"+(x*y));
	}
}
class Square extends Shape{
	Square(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of square:"+(x*x));
	}
}
class Circle extends Shape{
	Circle(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of circle:"+(3.14*x*x));
	}
}
class Area{
	public static void main(String ar[]){
		
		Rectangle r=new Rectangle(7,8);
		Square s=new Square(2);
		Circle c=new Circle(4);
		Shape ref;
		ref=r;
		r.area(7,8);
		ref=s;
		s.area(2);
		ref=c;
		c.area(4);
	}
}

Output:
Area of rectangle:56.0

Area of square:4.0

Area of circle:50.24



