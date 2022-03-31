public class TestShape {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle:" + " area =" + c1.getArea() + " perimeter=" + c1.getPerimeter());
        
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle:" + " area =" + r1.getArea() + " perimeter=" + r1.getPerimeter());
    }
}
