public class Triangle {

	private double Side1;
	private double Side2;
	private double Side3;
	private double Angle1;
	private double Angle2;
	private double Angle3;

	public Triangle(double Side1, double Side2, double Side3, double Angle1, double Angle2, double Angle3) {
		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;
		this.Angle1 = Angle1;
		this.Angle2 = Angle2;
		this.Angle3 = Angle3;
	}

	public double getSide1(){
		return this.Side1;
	}

	public double getSide2(){
		return this.Side2;
	}


	public double getSide3(){
		return this.Side3;
	}

	public double getAngle1(){
		return this.Angle1;
	}

	public double getAngle2(){
		return this.Angle2;
	}

	public double getAngle3(){
		return this.Angle3;
	}
	public double perimeter() {
		return this.Side1 + this.Side2 + this.Side3;
	}
}
