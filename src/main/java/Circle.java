public class Circle {
    private double rad;

    public Circle(double rads) {
        this.rad = rads;
    }

    public double getRad() {
        return this.rad;
    }

    public double circumference() {
        return 2 * 3.14 * this.rad;
    }

    public double area() {
        return 3.14 * this.rad * this.rad;
    }
}
