public class Main {
    public static void main(String[] args) {
        Shape shape =new Shape();
        System.out.println(shape.toString());
        Triangle triangle = new Triangle();
        System.out.println("Diện tích "+triangle.getArea());
        System.out.println("Chu vi "+triangle.getPrimeter());
    }
}
