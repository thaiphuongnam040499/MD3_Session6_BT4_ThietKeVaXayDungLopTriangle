public class Triangle extends Shape {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(){}
    public Triangle(String color, Boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPrimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p = getPrimeter();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
